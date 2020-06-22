package com.realc.safe.controller;

import com.alibaba.fastjson.JSONObject;
import com.realc.safe.mapper.LoginLogMapper;
import com.realc.safe.mapper.UserDetailMapper;
import com.realc.safe.model.LoginLog;
import com.realc.safe.model.UserDetail;
import com.realc.safe.util.DateKit;
import com.realc.safe.util.IpKit;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author lke-bai
 * @date 2020/6/13 15:01
 * <p>Company: realc·china</p>
 */
@Controller
@Slf4j
@RequestMapping("/")
public class SsoController {

    @GetMapping("/sso")
    public String sso(@RequestParam String callBack) {
        return "login.html?callBack="+callBack;
    }



}
