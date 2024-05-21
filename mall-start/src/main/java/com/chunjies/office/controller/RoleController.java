package com.chunjies.office.controller;

import com.chunjies.office.core.core.IController;
import com.chunjies.office.core.core.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "角色接口")
public class RoleController extends IController {
    @GetMapping("/list")
    @Operation(summary = "角色列表")
    public Result<String> roleList() {

        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary = "保存角色")
    public Result<String> addRole() {
        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary = "角色详情")
    public Result<String> roleDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary = "删除角色")
    public Result<String> deleteRole() {
        return Result.error();
    }

    @PostMapping("/saveCategory")
    @Operation(summary = "保存角色分类")
    public Result<String> saveRoleCategory() {
        return Result.error();
    }

}
