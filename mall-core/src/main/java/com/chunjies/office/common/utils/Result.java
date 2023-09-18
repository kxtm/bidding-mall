package com.chunjies.office.common.utils;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * {@code @author:} chunjie
 * {@code @date: }2023-09-15 22:26
 **/
public class Result<T> implements Serializable {
    private String traceId;

    private int code;

    private String msg;

    private T data;

    private Date timeStamp;

    public Result() {
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 成功返回信息
     *
     * @param msg  消息
     * @param data 数据
     * @param <T>
     * @return
     */
    public static <T> Result ok(String msg, T data) {
        return new Result(DEFAULT_SUCCESS_CODE, msg, data);
    }

    /**
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Result ok(String msg) {
        return new Result(DEFAULT_SUCCESS_CODE, msg, DEFAULT_DATA);
    }

    /**
     * @param code
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result ok(int code, String msg, T data) {
        return new Result(code, msg, data);
    }

    /**
     *
     * @param msg
     * @param data
     * @return
     * @param <T>
     */
    public static <T> Result error(String msg, T data) {
        return new Result(DEFAULT_ERROR_CODE, msg, data);
    }

    /**
     *
     * @param msg
     * @return
     * @param <T>
     */
    public static <T> Result error(String msg) {
        return new Result(DEFAULT_ERROR_CODE, msg, DEFAULT_DATA);
    }

    /**
     *
     * @param code
     * @param msg
     * @param data
     * @return
     * @param <T>
     */
    public static <T> Result error(int code, String msg, T data) {
        return new Result(code, msg, data);
    }

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


    public String getTraceId() {
        return (traceId == null ? UUID.randomUUID().toString() : traceId);
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Date getTimeStamp() {
        return (timeStamp == null ? Calendar.getInstance().getTime() : timeStamp);
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    final static int DEFAULT_SUCCESS_CODE = 1;
    final static int DEFAULT_ERROR_CODE = 0;
    final static String DEFAULT_DATA = "";


}
