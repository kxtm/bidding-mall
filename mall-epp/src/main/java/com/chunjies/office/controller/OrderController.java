package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Api(tags = "订单相关")
public class OrderController extends IController {


    @GetMapping("/list")
    @ApiOperation("获取订单列表")
    public Result<String> orderList() {
        return Result.error();
    }
}
