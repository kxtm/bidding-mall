package com.chunjies.office.core.configure;

import com.chunjies.office.core.exception.BizException;
import com.chunjies.office.core.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

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
        return Result.error(e.getAllErrors().get(0).getDefaultMessage());
    }
    @ExceptionHandler(BizException.class)
    public Result<String> handleBizException(BizException e, HttpServletRequest req) {
        logger.error("bindException地址:{},异常信息", req.getRequestURL(), e);
        return Result.error(e.getMessage());
    }
}

