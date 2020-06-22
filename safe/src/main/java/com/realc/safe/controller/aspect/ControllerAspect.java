package com.realc.safe.controller.aspect;

import com.alibaba.fastjson.JSONObject;
import com.realc.safe.mapper.LoginLogMapper;
import com.realc.safe.mapper.UserDetailMapper;
import com.realc.safe.model.LoginLog;
import com.realc.safe.util.DateKit;
import com.realc.safe.util.IpKit;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author lke-bai
 * @date 2020/6/13 15:01
 * <p>Company: realc·china</p>
 */
@Aspect
@Component
@Slf4j
public class ControllerAspect {
    @Autowired
    private UserDetailMapper userDetailMapper;
    @Autowired
    private LoginLogMapper loginLogMapper;

    @Around("execution(public * com.realc.safe.controller.LoginController.*(..))")
    public Object controllerLog(ProceedingJoinPoint pdj) throws Throwable{
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        //开始时间
        long startTime = System.currentTimeMillis();
        //获取参数数组
        Object[] args = pdj.getArgs();
        Map<String,Object> result = null;
        long endTime = 0L;
        //记录登录日志
        String ip = IpKit.getIpAddr(request);
        LoginLog loginLog = new LoginLog();
        loginLog.setLogId(UUID.randomUUID().toString().replaceAll("-", ""));
        loginLog.setLogIp(ip);
        String userName = ((JSONObject)args[0]).getString("userName");
        loginLog.setLogAccount(userName);

        //执行原方法并获取返回结果
        result = (Map<String,Object>)pdj.proceed(args);
        //结束时间
        endTime = System.currentTimeMillis();

        //查询登录日志
        List<LoginLog> loginLogs =loginLogMapper.selectByCondition("log_account = '" + userName + "' and log_ip = '" + ip +"'");

        if (loginLogs.size()>0){
            log.info("safe Ip已经登陆过...");
            result.put("status","0");
        } else {
            //Ip未登录过
            log.info("unsafe Ip未登陆过，记录");
            result.put("status","-1");
        }


        loginLog.setLogImei("");
        loginLog.setIsSuccess(result.get("code").toString());
        loginLog.setCreateTime(DateKit.parseDateToStr(new Date(),DateKit.DATE_TIME_FORMAT_YYYY_MM_DD_HH_MI_SS));
        loginLogMapper.insert(loginLog);

        // 记录下请求内容
        StringBuilder sb = new StringBuilder();
        sb.append("###请求URL: " + request.getRequestURL().toString());
        sb.append("   ###IP: " + ip);
        sb.append("   ###Params: " + Arrays.toString(args));
        sb.append("   ###CLASS_METHOD: " + pdj.getSignature().getDeclaringTypeName() + "." + pdj.getSignature().getName());
        sb.append("   ###耗时: " + (endTime - startTime) + "毫秒");
        sb.append("   ###耗时: " + result + "毫秒");

        log.info(sb.toString());
        return result;





    }
}
