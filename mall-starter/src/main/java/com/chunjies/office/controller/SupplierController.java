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
@RequestMapping("/supplier")
@Api(tags = "供应商")
public class SupplierController extends IController {

    @GetMapping("/list")
    @ApiOperation("供应商列表")
    public Result<String> supplierList() {
        return Result.error();
    }

    @GetMapping("/query")
    @ApiOperation("查询供应商")
    public Result<String> querySupplier() {
        return Result.error();
    }

    @PostMapping("/save")
    @ApiOperation("保存供应商")
    public Result<String> saveSupplier() {
        return Result.error();
    }

    @PostMapping("/delete")
    @ApiOperation("删除供应商")
    public Result<String> deleteSupplier() {
        return Result.error();
    }

    @PostMapping("/saveAccount")
    @ApiOperation("保存登录账户")
    public Result<String> saveSupplierAccount() {
        return Result.error();
    }


}
