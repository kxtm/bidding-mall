package com.chunjies.office.config;

import com.chunjies.office.core.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    final Logger log= LoggerFactory.getLogger(GlobalHandler.class);

    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e, HttpServletRequest req) {
        log.error("请求地址 {} Exception:{}",req.getRequestURL(),e);
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public Result handleRunException(Exception e,HttpServletRequest req) {
        log.error("请求地址 {} RunException:{}",req.getRequestURL(),e);
        return Result.error("系统错误");
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public Result noHandleRunException(Exception e,HttpServletRequest req) {
        log.error("请求地址 {} NoHandlerFoundException:{}",req.getRequestURL(),e);
        return Result.error("请求不存在");
    }
}

