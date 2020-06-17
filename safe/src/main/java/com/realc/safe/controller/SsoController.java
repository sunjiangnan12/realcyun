package com.realc.safe.controller;

import com.alibaba.fastjson.JSONObject;
import com.realc.safe.mapper.LoginLogMapper;
import com.realc.safe.mapper.UserDetailMapper;
import com.realc.safe.model.LoginLog;
import com.realc.safe.model.UserDetail;
import com.realc.safe.util.IpKit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author lke-bai
 * @date 2020/6/13 15:01
 * <p>Company: realc·china</p>
 */
@RestController
@Slf4j

public class SsoController {

    @Autowired
    private UserDetailMapper userDetailMapper;
    @Autowired
    private LoginLogMapper loginLogMapper;



    @GetMapping(value = "/hello/{str}", produces = "application/json;charset=UTF-8")
    public String hello(@PathVariable String str) {
        log.info("-----------收到消费者请求-----------");
        log.info("收到消费者传递的参数：" + str);
        String result = "我是服务提供者，见到你很高兴==>" + str;
        log.info("提供者返回结果：" + result);
        return result;
    }

    @ResponseBody
    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    public String login(@RequestBody JSONObject json, HttpServletRequest request){
        String userName = json.getString("user_name");
        String password = json.getString("password");
        String ip = IpKit.getIpAddr(request);
        List<LoginLog> loginLogs =loginLogMapper.selectByCondition("log_account = '" + userName + "' and log_ip = '" + ip +"'");
        if (loginLogs.size()>0){
            log.info("safe Ip已经登陆过...");

        } else {
            LoginLog loginLog = new LoginLog();

            loginLog.setLogIp(ip);
            loginLogMapper.insert(loginLog);
            log.info("unsafe Ip未登陆过，记录");
        }
        UserDetail userDetail =  userDetailMapper.login(userName,password);
        if (userDetail!=null){
            log.info("登录成功");
            log.info("记录登录日志");
            log.info("记录redis，分配ticket");
            log.info("返回returnUrl");
        }else{
            log.info("登录失败");
            log.info("记录失败日志，今天可登录次数-1");
            return userName+":"+password+"login failed";
        }
        return userName+":"+password+"login success";
    }

}
