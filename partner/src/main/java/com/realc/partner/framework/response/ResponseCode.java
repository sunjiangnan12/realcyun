package com.realc.partner.framework.response;

public enum ResponseCode {

    SUCESS(200, "sucess"),
    FAILURE(500, "failure"),
    REQUEST_METHOD_NOT_SUPPORTED(405,"request_method_not_supported"),
    COULD_NOT_READ_JSON(400,"could_not_read_json"),
    CONTENT_TYPE_NOT_SUPPORTED(415,"content_type_not_supported");

    private Integer code;
    private String message;

    private ResponseCode() {
    }

    ResponseCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
