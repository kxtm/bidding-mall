package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@Tag(name = "商品分类")
public class CategoryController extends IController {


    @GetMapping("/list")
    @Operation(summary ="查询一级商品分类")
    public Result<String> categoryList() {
        return Result.error();
    }

    @GetMapping("/queryChild")
    @Operation(summary ="查询子级分类")
    public Result<String> childCategory() {
        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary ="保存分类")
    public Result<String> addCategory() {
        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary ="分类详情")
    public Result<String> cateDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary ="删除分类")
    public Result<String> deleteCategory() {
        return Result.error();
    }
}
