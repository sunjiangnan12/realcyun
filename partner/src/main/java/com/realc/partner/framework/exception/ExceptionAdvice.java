package com.realc.partner.framework.exception;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.realc.partner.framework.response.ResponseResult;
import com.realc.partner.framework.response.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class ExceptionAdvice {

    /**
     * 400 - Bad Request
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
@RequestMapping(produces = "application/json;charset=UTF-8")
    public ResponseResult handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        log.error("参数解析失败", e, ExceptionAdvice.class);
        return new ResponseResult().failure(ResponseCode.COULD_NOT_READ_JSON);
    }

    /**
     * 405 - Method Not Allowed
     */
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    public ResponseResult handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        log.error("不支持当前请求方法", e, ExceptionAdvice.class);
        return new ResponseResult().failure(ResponseCode.REQUEST_METHOD_NOT_SUPPORTED);
    }

    /**
     * 415 - Unsupported Media Type
     */
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    @ResponseBody
    public ResponseResult handleHttpMediaTypeNotSupportedException(Exception e) {
        log.error("不支持当前媒体类型", e, ExceptionAdvice.class);
        return new ResponseResult().failure(ResponseCode.CONTENT_TYPE_NOT_SUPPORTED);
    }

    /**
     * 500 - Internal Server Error
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseResult handleException(Exception e) {
        log.error("服务运行异常", e, ExceptionAdvice.class);
        return new ResponseResult().failure(e.getMessage());
    }

    /**
     * CommonException全局异常捕捉处理
     * @param
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = CommonException.class)
    public ResponseResult errorHandler(CommonException e) {
        return new ResponseResult().failure(e.getCode());
    }

}