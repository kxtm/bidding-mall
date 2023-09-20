package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */

@RestController
@Api(tags = "用户模块")
@RequestMapping("/api/user")
public class UserController extends IController {


    @GetMapping("/getUserInfo")
    @ApiOperation("获取用户信息")
    public Result userInfo(){
        return Result.error();
    }
}
