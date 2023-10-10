package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public Result<String> roleList() {

        return Result.error();
    }

    @PostMapping("/save")
    @ApiOperation("保存角色")
    public Result<String> addRole() {
        return Result.error();
    }

    @GetMapping("/detail")
    @ApiOperation("角色详情")
    public Result<String> roleDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @ApiOperation("删除角色")
    public Result<String> deleteRole() {
        return Result.error();
    }
}
