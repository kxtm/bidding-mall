package com.chunjies.office.config;

import com.chunjies.office.core.base.Result;
import com.chunjies.office.core.exception.BizException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.NestedRuntimeException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * {@code @author:} chunjie
 * {@code @date: }2023-09-15 22:57
 **/

@RestControllerAdvice
public class GlobalHandler {
    final Logger logger = LoggerFactory.getLogger(GlobalHandler.class);

    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e, HttpServletRequest req) {
        logger.error("handleException地址->{},异常信息:", req.getRequestURL(), e);
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public Result<String> handleRunException(RuntimeException e, HttpServletRequest req) {
        logger.error("handleRunException地址{},异常信息", req.getRequestURL(), e);
        return Result.error("系统错误");
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public Result<String> noFoundException(NoHandlerFoundException e, HttpServletRequest req) {
        logger.error("NoFoundException地址{},异常信息", req.getRequestURL(), e);
        return Result.error("请求不存在");
    }

    @ExceptionHandler(BindException.class)
    public Result<String> handleBindException(BindException e, HttpServletRequest req) {
        logger.error("bindException地址:{},异常信息", req.getRequestURL(), e);
        return Result.error(e.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(BizException.class)
    public Result<String> handleBizException(BizException e, HttpServletRequest req) {
        logger.error("bindException地址:{},异常信息", req.getRequestURL(), e);
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        logger.error("handleMethodArgumentNotValidException 异常信息:{}", e);
        return Result.error(e.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(ServletException.class)
    public Result<String> handServletException(ServletException e, HttpServletRequest req) {
        logger.error("handNestedRuntimeException地址->{},异常信息:", req.getRequestURL(), e);
        return Result.error("请求方法不支持");
    }

    @ExceptionHandler(NestedRuntimeException.class)
    public Result<String> handNestedRuntimeException(NestedRuntimeException e, HttpServletRequest req) {
        logger.error("handNestedRuntimeException地址->{},异常信息:", req.getRequestURL(), e);
        return Result.error("参数不能为空");
    }
}
