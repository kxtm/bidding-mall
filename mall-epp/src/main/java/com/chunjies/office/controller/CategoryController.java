package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@Api(tags ="商品分类")
public class CategoryController extends IController {


    @GetMapping("/list")
    @ApiOperation("所有一级商品分类")
    public Result<String> categoryList(){

        return Result.error();
    }
}
