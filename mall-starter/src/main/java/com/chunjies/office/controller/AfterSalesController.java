package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/AfterSales")
@Api(tags = "售后服务")
public class AfterSalesController extends IController {

    @GetMapping("/list")
    @ApiOperation("售后列表")
    public Result<String> afterSalesList() {

        return Result.error();
    }

}
