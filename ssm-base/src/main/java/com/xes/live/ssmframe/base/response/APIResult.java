package com.xes.live.ssmframe.base.response;

import java.util.HashMap;

/**
 * Created by liuweishi on 2017/8/1.
 */
public class APIResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    public static final int SUCCESS = 0;
    public static final int SYS_ERROR = 1;
    public static final int BUSS_ERROR = 2;

    public APIResult() {
    }

    public APIResult(Object result) {
        this.setStatus(0);
        this.setMessage("调用成功");
        this.setData(result);
    }

    public APIResult success() {
        this.setStatus(0);
        this.setMessage("调用成功");
        return this;
    }

    public APIResult success(Object data) {
        this.setStatus(0);
        this.setMessage("调用成功");
        this.setData(data);
        return this;
    }

    public APIResult failure(int code, String message) {
        this.setMessage(message);
        this.setCode(code);
        return this;
    }

    public int getStatus() {
        return Integer.parseInt(String.valueOf(this.get("status")));
    }

    public void setStatus(int status) {
        this.put("status", String.valueOf(status));
    }

    public int getCode() {
        return Integer.parseInt(String.valueOf(this.get("code")));
    }

    public void setCode(int code) {
        this.put("status", String.valueOf(code));
    }

    public String getMessage() {
        return (String)this.get("message");
    }

    public void setMessage(String message) {
        this.put("message", message);
    }

    public Object getData() {
        return this.get("result");
    }

    public void setData(Object data) {
        this.put("result", data);
    }
}
