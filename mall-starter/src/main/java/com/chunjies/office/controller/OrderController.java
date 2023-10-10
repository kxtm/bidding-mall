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
@RequestMapping("/order")
@Api(tags = "订单接口")
public class OrderController extends IController {


    @GetMapping("/list")
    @ApiOperation("订单列表")
    public Result<String> orderList() {
        return Result.error();
    }

    @PostMapping("/save")
    @ApiOperation("保存订单")
    public Result<String> saveOrder() {
        return Result.error();
    }

    @GetMapping("/detail")
    @ApiOperation("订单详情")
    public Result<String> orderDetail() {
        return Result.error();
    }

    @GetMapping("/delete")
    @ApiOperation("删除订单")
    public Result<String> deleteOrder() {
        return Result.error();
    }
}