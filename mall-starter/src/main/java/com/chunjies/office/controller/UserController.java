package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */

@RestController
@Api(tags = "用户接口")
@RequestMapping("/user")
public class UserController extends IController {


    @GetMapping("/list")
    @ApiOperation("用户列表")
    public Result<String> userList() {
        return Result.error();
    }

    @PostMapping("/save")
    @ApiOperation("保存用户")
    public Result<String> saveUser() {
        return Result.error();
    }

    @GetMapping("/query")
    @ApiOperation("用户详情")
    public Result<String> userDetail() {
        return Result.error();
    }


    @PostMapping("/delete")
    @ApiOperation("删除用户")
    public Result<String> deleteUser() {
        return Result.error();
    }


    @PostMapping("/queryDept")
    @ApiOperation("查询用户部门")
    public Result<String> queryUserDept(){
        return Result.error();
    }

    @PostMapping("/saveDept")
    @ApiOperation("保存用户部门")
    public Result<String> saveUserDept(){
        return Result.error();
    }



    @PostMapping("/queryRole")
    @ApiOperation("保存用户角色")
    public Result<String> queryUserRole(){
        return Result.error();
    }

    @PostMapping("/saveRole")
    @ApiOperation("保存用户角色")
    public Result<String> saveUserRole(){
        return Result.error();
    }





}
