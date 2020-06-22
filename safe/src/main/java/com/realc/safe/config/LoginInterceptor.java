package com.realc.safe.config;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆拦截器
 * @author 柏子画
 * @Email zihua_bai@qq.com
 * @date 2019年10月25日
 */
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
    private static final Logger log = LoggerFactory.getLogger(LoginInterceptor.class);
	@Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        
        HttpSession session = httpServletRequest.getSession();
        String URI = httpServletRequest.getRequestURI();
        log.info("請求地址："+URI);
        if(URI.equals("/error")) {
        	httpServletRequest.getRequestDispatcher("/login.html").forward(httpServletRequest, httpServletResponse);
        	return false;
        }
        
        if(session.getAttribute("user_id")==null || session.getAttribute("user_id").equals("")) {
        	httpServletResponse.sendRedirect("/login.html");
        	return false;
        }

        return super.preHandle(httpServletRequest, httpServletResponse, handler);
	}

}
