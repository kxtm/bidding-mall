package com.chunjies.office.controller;

import com.chunjies.office.core.core.IController;
import com.chunjies.office.core.core.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
@Tag(name = "供应商")
public class SupplierController extends IController {

    @GetMapping("/list")
    @Operation(summary = "供应商列表")
    public Result<String> supplierList() {
        return Result.error();
    }

    @GetMapping("/query")
    @Operation(summary = "查询供应商")
    public Result<String> querySupplier() {
        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary = "保存供应商")
    public Result<String> saveSupplier() {
        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary = "删除供应商")
    public Result<String> deleteSupplier() {
        return Result.error();
    }

    @PostMapping("/saveAccount")
    @Operation(summary = "保存登录账户")
    public Result<String> saveSupplierAccount() {
        return Result.error();
    }


}
