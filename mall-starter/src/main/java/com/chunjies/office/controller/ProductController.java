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
@RequestMapping("/prod")
@Tag(name = "商品接口")
public class ProductController extends IController {

    @GetMapping("/list")
    @Operation(summary = "商品列表")
    public Result<String> ProductList() {

        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary = "保存商品")
    public Result<String> addProduct() {
        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary = "商品详情")
    public Result<String> productDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary = "删除商品")
    public Result<String> deleteProduct() {
        return Result.error();
    }
}
