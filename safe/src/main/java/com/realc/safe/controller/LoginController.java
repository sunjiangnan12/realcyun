package com.realc.safe.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.nacos.common.utils.Md5Utils;
import com.realc.safe.mapper.LoginLogMapper;
import com.realc.safe.mapper.UserDetailMapper;
import com.realc.safe.model.UserDetail;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * <company> 上海瑞而克信息科技有限公司
 *
 * @author lke-bai
 * @date 2020/6/18 12:45
 * <description>
 */
@RestController
@Slf4j
public class LoginController {

    @Autowired
    private UserDetailMapper userDetailMapper;

    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    public Map<String,Object> login(@RequestBody JSONObject json, HttpServletRequest request) throws IOException {
        String userName = json.getString("userName");
        String password = json.getString("password");
        String callBack = json.getString("callBack");

        Map<String,Object> result = new HashMap<String,Object>();

        //callBack解密
        BASE64Encoder encoder = new BASE64Encoder();
        BASE64Decoder decoder = new BASE64Decoder();

        result.put("callBack", new String(decoder.decodeBuffer(URLDecoder.decode(callBack))));
        UserDetail userDetail =  userDetailMapper.login(userName, Md5Utils.getMD5(password,"Utf-8"));
        if (userDetail!=null){
            log.info("登录成功");
            result.put("code","0");
            result.put("msg","login success");
            log.info("记录登录日志");
            log.info("记录redis，分配ticket");
            log.info("返回returnUrl");
        }else{
            result.put("code","-1");
            result.put("msg","login failed");
            log.info("登录失败");
            log.info("记录失败日志，今天可登录次数-1");
        }
        return result;
    }


}
