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
@RequestMapping("/prod")
@Api(tags = "商品接口")
public class ProductController extends IController {

    @GetMapping("/list")
    @ApiOperation("商品列表")
    public Result<String> ProductList() {

        return Result.error();
    }

    @PostMapping("/save")
    @ApiOperation("保存商品")
    public Result<String> addProduct() {
        return Result.error();
    }

    @GetMapping("/detail")
    @ApiOperation("商品详情")
    public Result<String> productDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @ApiOperation("删除商品")
    public Result<String> deleteProduct() {
        return Result.error();
    }
}
