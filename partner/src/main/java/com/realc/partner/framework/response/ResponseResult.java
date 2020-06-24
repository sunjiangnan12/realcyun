package com.realc.partner.framework.response;

/**
 * @author EDZ
 */
public class ResponseResult {
    private Meta meta;
    private Object data;
    private Page page;

    public Object getData() {
        return data;
    }

    public Page getPage() {
        return page;
    }

    public ResponseResult() {
    }

    public ResponseResult(Object data, Page page) {
        meta = new Meta(ResponseCode.SUCESS);
        this.data = data;
        this.page = page;
    }
    public ResponseResult failure(ResponseCode meta) {
        this.meta = new Meta(meta);
        return this;
    }
    public ResponseResult failure(Object data) {
        this.meta = new Meta(ResponseCode.FAILURE);
        this.data = data;
        return this;
    }

    public ResponseResult sucess() {
        this.meta = new Meta(ResponseCode.SUCESS);
        return this;
    }

    public ResponseResult sucess(Object data) {
        this.meta = new Meta(ResponseCode.SUCESS);
        this.data = data;
        return this;
    }

    public ResponseResult sucess(Object data, Page page) {
        this.meta = new Meta(ResponseCode.SUCESS);
        this.data = data;
        this.page = page;
        return this;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "meta=" + meta +
                ", data=" + data +
                ", page=" + page +
                '}';
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
class Meta {

    private Integer success;
    private String message;

    public Meta(Integer success) {
        this.success = success;
    }

    public Meta(Integer success, String message) {
        this.success = success;
        this.message = message;
    }

    public Meta(ResponseCode code) {
        this.success = code.getCode();
        this.message = code.getMessage();
    }

    public int getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }
}
