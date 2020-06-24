package com.realc.partner.framework.exception;

public class CommonException extends RuntimeException{

    private static final long serialVersionUID = -1520611349905717570L;
    private int code;

    public CommonException() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public CommonException(int code) {
        this.code = code;
    }

    public CommonException(String code) {
        this.code = Integer.valueOf(code);
    }

    public CommonException(int code, String message) {
        super(message);
        this.code = code;
    }

    public CommonException(Throwable t) {
        super(t);
    }

}
