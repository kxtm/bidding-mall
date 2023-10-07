package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/7
 * {@code @description}
 */
@RestController
@RequestMapping("/auth")
@Api(tags = "登录接口")
public class LoginController extends IController {

    @PostMapping("/login")
    @ApiOperation("用户登录")
    public Result<String> login() {
        return Result.error();
    }


    @GetMapping("/logOut")
    @ApiOperation("用户退出")
    public Result<String> logOut(){

        return Result.error();
    }
}
