package com.realc.safe.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <company> 上海瑞而克信息科技有限公司
 *
 * @author lke-bai
 * @date 2020/6/19 13:57
 * <description>
 */

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 全局异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map exceptionHandler(HttpServletRequest request, Exception e) {
        log.error("", e);

        Map json = new HashMap();
        json.put("msg", e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            json.put("code", 404);
        } else {
            json.put("code", 500);
        }
        json.put("path", request.getRequestURI());
        return json;
    }

}
