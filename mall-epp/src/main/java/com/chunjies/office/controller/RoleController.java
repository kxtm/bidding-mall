package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/5
 * {@code @description}
 */

@RestController
@RequestMapping("/role")
@Api(tags = "角色接口")
public class RoleController extends IController {
    @GetMapping("/list")
    @ApiOperation("角色列表")
    public Result<String> roleList(){

        return Result.error();
    }
}
