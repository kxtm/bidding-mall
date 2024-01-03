package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */

@RestController
@Tag(name = "用户接口")
@RequestMapping("/user")
public class UserController extends IController {


    @GetMapping("/list")
    @Operation(summary = "用户列表")
    public Result<String> userList() {
        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary = "保存用户")
    public Result<String> saveUser() {
        return Result.error();
    }

    @GetMapping("/query")
    @Operation(summary = "用户详情")
    public Result<String> userDetail() {
        return Result.error();
    }


    @PostMapping("/delete")
    @Operation(summary = "删除用户")
    public Result<String> deleteUser() {
        return Result.error();
    }


    @PostMapping("/queryDept")
    @Operation(summary = "查询用户部门")
    public Result<String> queryUserDept() {
        return Result.error();
    }

    @PostMapping("/saveDept")
    @Operation(summary = "保存用户部门")
    public Result<String> saveUserDept() {
        return Result.error();
    }


    @PostMapping("/queryRole")
    @Operation(summary = "保存用户角色")
    public Result<String> queryUserRole() {
        return Result.error();
    }

    @PostMapping("/saveRole")
    @Operation(summary = "保存用户角色")
    public Result<String> saveUserRole() {
        return Result.error();
    }


}
