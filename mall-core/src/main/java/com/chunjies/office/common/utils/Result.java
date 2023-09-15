package com.chunjies.office.common.utils;

import java.io.Serializable;

/**
 * {@code @author:} chunjie
 * {@code @date: }2023-09-15 22:26
 **/
public class Result <T> implements Serializable {

    private int code;

    private String msg;

    private T data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
