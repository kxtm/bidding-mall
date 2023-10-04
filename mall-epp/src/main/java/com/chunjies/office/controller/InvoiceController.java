package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
@Api(tags = "发票接口")
public class InvoiceController extends IController {


    @GetMapping("/list")
    @ApiOperation("发票列表")
    public Result<String> invoiceList() {

        return Result.error();
    }

    @PostMapping("/save")
    @ApiOperation("保存发票")
    public Result<String> saveInvoiceInfo() {
        return Result.error();
    }

    @GetMapping("/detail")
    @ApiOperation("发票详情")
    public Result<?> getInvoiceDetail() {

        return Result.error();
    }


    @GetMapping("/applyList")
    @ApiOperation("开票申请列表")
    public Result<?> getInvoiceApplyList() {

        return Result.error();
    }

    @PostMapping("/saveApply")
    @ApiOperation("保存开票申请")
    public Result<String> saveInvoiceApply() {
        return Result.error();
    }

    @GetMapping("/getApplyDetail")
    @ApiOperation("获取开票申请详情")
    public Result<?> getInvoiceApplyDetail() {
        return Result.error();
    }

}
