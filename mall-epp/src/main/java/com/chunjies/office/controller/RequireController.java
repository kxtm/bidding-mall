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
@RequestMapping("/require")
@Api(tags = "需求接口")
public class RequireController extends IController {


    @GetMapping("/list")
    @ApiOperation("需求列表")
    public Result<String> requireList() {
        return Result.error();
    }
    @PostMapping("/save")
    @ApiOperation("保存需求")
    public Result<String> addRequire() {

        return Result.error();
    }
    @GetMapping("/detail")
    @ApiOperation("需求详情")
    public Result<String> requireDetail() {
        return Result.error();
    }


    @PostMapping("/delete")
    @ApiOperation("删除需求")
    public Result<String> deleteRequire() {
        return Result.error();
    }
}
