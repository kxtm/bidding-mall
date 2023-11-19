package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@Api(tags = "商品分类")
public class CategoryController extends IController {


    @GetMapping("/list")
    @ApiOperation("查询一级商品分类")
    public Result<String> categoryList() {
        return Result.error();
    }

    @GetMapping("/queryChild")
    @ApiOperation("查询子级分类")
    public Result<String> childCategory() {
        return Result.error();
    }

    @PostMapping("/save")
    @ApiOperation("保存分类")
    public Result<String> addCategory() {
        return Result.error();
    }

    @GetMapping("/detail")
    @ApiOperation("分类详情")
    public Result<String> cateDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @ApiOperation("删除分类")
    public Result<String> deleteCategory() {
        return Result.error();
    }
}
