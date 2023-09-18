package com.chunjies.office.config;

import com.chunjies.office.common.utils.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * {@code @author:} chunjie
 * {@code @date: }2023-09-15 22:57
 **/

@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        return Result.error(e.getMessage());
    }
}
