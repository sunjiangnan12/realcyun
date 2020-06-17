package com.realc.safe.controller;

import com.alibaba.fastjson.JSONObject;
import com.realc.safe.mapper.LoginLogMapper;
import com.realc.safe.mapper.UserDetailMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lke-bai
 * @date 2020/6/13 15:01
 * <p>Company: realc·china</p>
 */
@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SsoController {

    private UserDetailMapper UserDetailMapper;
    private LoginLogMapper LoginLogMapper;



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
    public String login(@RequestBody JSONObject json){
        String userName = json.getString("user_name");
        String password = json.getString("password");

        UserDetailMapper.login(userName,password);
        return "";
    }

}
