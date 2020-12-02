package com.test.tools.demo.tools.response;

public class ServerResult<T> {
    private boolean rlt = true;
    private String message;
    private String code = "000000";
    private T data;

    public boolean isRlt() {
        return rlt;
    }

    public void setRlt(boolean rlt) {
        this.rlt = rlt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }




}
