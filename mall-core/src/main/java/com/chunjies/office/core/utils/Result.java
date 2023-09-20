package com.chunjies.office.core.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * {@code @author:} chunjie
 * {@code @date: }2023-09-15 22:26
 **/
@ApiModel(description = "结果返回模型")
public class Result<T> implements Serializable {

    @ApiModelProperty("链路ID")
    private String traceId;
    @ApiModelProperty(value = "错误码 1 成功,0失败")
    private int code;
    @ApiModelProperty(value = "错误信息")
    private String msg;
    @ApiModelProperty(value = "返回数据")
    private T data;
    @ApiModelProperty("请求时间")
    private Date timeStamp;

    public Result() {
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static <T> Result ok() {
        return new Result(DEFAULT_SUCCESS_CODE, DEFAULT_OK_MSG, DEFAULT_DATA);
    }

    /**
     * 成功返回信息
     *
     * @param msg  消息
     * @param data 数据
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

    public static <T> Result error() {
        return new Result(DEFAULT_ERROR_CODE, DEFAULT_ERROR_MSG, DEFAULT_DATA);
    }

    /**
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result error(String msg, T data) {
        return new Result(DEFAULT_ERROR_CODE, msg, data);
    }

    /**
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Result error(String msg) {
        return new Result(DEFAULT_ERROR_CODE, msg, DEFAULT_DATA);
    }

    /**
     * @param code
     * @param msg
     * @param data
     * @param <T>
     * @return
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
    final static String DEFAULT_OK_MSG = "请求成功";
    final static String DEFAULT_ERROR_MSG = "无效请求";

}
