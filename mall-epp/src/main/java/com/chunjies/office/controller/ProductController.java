package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
@Api(tags = "商品接口")
public class ProductController extends IController {

    @GetMapping("/list")
    @ApiOperation("获取商品列表")
    public Result<String> prodList() {

        return Result.error();
    }
}
