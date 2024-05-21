package com.chunjies.office.controller;

import com.chunjies.office.core.core.IController;
import com.chunjies.office.core.core.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/AfterSales")
@Tag(name = "售后服务")
public class AfterSalesController extends IController {

    @GetMapping("/list")
    @Operation(summary ="售后列表")
    public Result<String> afterSalesList() {

        return Result.error();
    }

}
