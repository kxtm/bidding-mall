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
@RequestMapping("/order")
@Tag(name = "订单接口")
public class OrderController extends IController {


    @GetMapping("/list")
    @Operation(summary = "订单列表")
    public Result<String> orderList() {
        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary = "保存订单")
    public Result<String> saveOrder() {
        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary = "订单详情")
    public Result<String> orderDetail() {
        return Result.error();
    }

    @GetMapping("/delete")
    @Operation(summary = "删除订单")
    public Result<String> deleteOrder() {
        return Result.error();
    }
}
