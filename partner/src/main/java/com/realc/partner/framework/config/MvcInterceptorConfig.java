package com.realc.partner.framework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;

/**
 * @author EDZ
 */
@Configuration
public class MvcInterceptorConfig extends WebMvcConfigurationSupport {
    @Resource
    private LoginInterceptor loginInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则，/**表示拦截所有请求
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**");
//                .excludePathPatterns("/stuInfo/getAllStuInfoA","/account/register");
        super.addInterceptors(registry);
    }
}
