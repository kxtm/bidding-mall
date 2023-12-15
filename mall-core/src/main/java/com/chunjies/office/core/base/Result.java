package com.chunjies.office.core.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * {@code @author:} chunjie
 * {@code @date: }2023-09-15 22:26
 **/
@Schema(name = "结果模型")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {

    @SchemaProperty(name = "链路ID")
    private String traceId;
    @SchemaProperty(name = "错误码 1 成功,0失败")
    private int code;
    @SchemaProperty(name = "错误信息")
    private String msg;
    @SchemaProperty(name = "返回数据")
    private T data;
    @SchemaProperty(name = "请求时间")
    private Date timeStamp;

    public Result() {
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static <T> Result<T> ok() {
        return new Result<>(DEFAULT_SUCCESS_CODE, DEFAULT_OK_MSG, null);
    }

    public static <T> Result<T> ok(String msg, T data) {
        return new Result<>(DEFAULT_SUCCESS_CODE, msg, data);
    }


    public static <T> Result<T> ok(String msg) {
        return new Result<>(DEFAULT_SUCCESS_CODE, msg, null);
    }


    public static <T> Result<T> ok(int code, String msg, T data) {
        return new Result<>(code, msg, data);
    }

    public static <T> Result<T> error() {
        return new Result<>(DEFAULT_ERROR_CODE, DEFAULT_ERROR_MSG, null);
    }


    public static <T> Result<T> error(String msg, T data) {
        return new Result<>(DEFAULT_ERROR_CODE, msg, data);
    }


    public static <T> Result<T> error(String msg) {
        return new Result<>(DEFAULT_ERROR_CODE, msg, null);
    }


    public static <T> Result<T> error(int code, String msg, T data) {
        return new Result<>(code, msg, data);
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
    final static String DEFAULT_OK_MSG = "请求成功";
    final static String DEFAULT_ERROR_MSG = "无效请求";

}
