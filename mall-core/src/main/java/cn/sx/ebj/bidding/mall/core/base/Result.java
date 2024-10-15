package cn.sx.ebj.bidding.mall.core.base;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.UUID;

/**
 * 结果模型
 * {@code @author:} chunjie
 * {@code @date: }2023-09-15 22:26
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {

    //链路ID
    private String traceId = UUID.randomUUID().toString().toUpperCase();
    //错误码 1 成功,0失败
    private int code;
    //错误信息
    private String msg;
    //返回数据
    private T data;
    //请求时间
    private Long timeStamp = System.currentTimeMillis();

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

    public static <T> Result<T> ok(T data) {
        return new Result<>(DEFAULT_SUCCESS_CODE, DEFAULT_OK_MSG, data);
    }

    public static <T> Result<T> error() {
        return new Result<>(DEFAULT_ERROR_CODE, DEFAULT_ERROR_MSG, null);
    }


    public static <T> Result<T> error(T data) {
        return new Result<>(DEFAULT_ERROR_CODE, DEFAULT_ERROR_MSG, data);
    }
    
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
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

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    final static int DEFAULT_SUCCESS_CODE = 1;
    final static int DEFAULT_ERROR_CODE = 0;
    final static String DEFAULT_OK_MSG = "处理成功";
    final static String DEFAULT_ERROR_MSG = "处理失败";

}
