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
@RequestMapping("/address")
@Tag(name = "收货地址")
public class AddressController extends IController {


    @GetMapping("/list")
    @Operation(summary = "获取地址列表")
    public Result<String> addressList() {

        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary = "保存地址")
    public Result<String> saveAddress() {
        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary = "地址详情")
    public Result<String> addressDetail() {

        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary = "删除地址")
    public Result<String> deleteAddress() {
        return Result.error();
    }
}
