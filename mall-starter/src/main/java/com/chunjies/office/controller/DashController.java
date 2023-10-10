package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author:} chunjie
 * {@code @date:} 2023-09-15 22:23
 **/

@RestController
@Api(tags = "仪表盘")
@RequestMapping("/dashBoard")
public class DashController extends IController {

    @GetMapping("/user")
    @ApiOperation("用户仪表盘")
    public Result<String> userBoard() {

        return Result.error();
    }

    @GetMapping("/system")
    @ApiOperation("管理员仪表盘")
    public Result<String> adminBoard() {
        return Result.error();
    }

}
