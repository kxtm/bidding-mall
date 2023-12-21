package com.chunjies.office.core.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * {@code @author:} chunjie
 * {@code @date: }2023-09-15 22:26
 **/
@Schema(name = "结果模型")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Result<T> implements Serializable {

    @SchemaProperty(name = "链路ID")
    private String traceId = UUID.randomUUID().toString();
    @SchemaProperty(name = "错误码 1 成功,0失败")
    private int code;
    @SchemaProperty(name = "错误信息")
    @Getter
    private String msg;
    @SchemaProperty(name = "返回数据")
    @Getter
    private T data;
    @SchemaProperty(name = "请求时间")
    private LocalDateTime timeStamp =LocalDateTime.now();

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

    final static int DEFAULT_SUCCESS_CODE = 1;
    final static int DEFAULT_ERROR_CODE = 0;
    final static String DEFAULT_OK_MSG = "请求成功";
    final static String DEFAULT_ERROR_MSG = "无效请求";

}
