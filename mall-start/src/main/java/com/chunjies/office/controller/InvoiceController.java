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
@RequestMapping("/invoice")
@Tag(name =  "发票接口")
public class InvoiceController extends IController {


    @GetMapping("/list")
    @Operation(summary ="发票列表")
    public Result<String> invoiceList() {

        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary ="保存发票")
    public Result<String> saveInvoiceInfo() {
        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary ="发票详情")
    public Result<?> getInvoiceDetail() {

        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary ="删除发票明细")
    public Result<String> deleteInvoiceInfo() {
        return Result.error();
    }

    @GetMapping("/applyList")
    @Operation(summary ="发票申请列表")
    public Result<?> getInvoiceApplyList() {

        return Result.error();
    }

    @PostMapping("/saveApply")
    @Operation(summary ="保存开票申请")
    public Result<String> saveInvoiceApply() {
        return Result.error();
    }

    @GetMapping("/applyDetail")
    @Operation(summary ="获取开票申请详情")
    public Result<?> getInvoiceApplyDetail() {
        return Result.error();
    }

    @PostMapping("/delteApply")
    @Operation(summary ="删除开票申请")
    public Result<String> deleteInvoiceApply() {
        return Result.error();
    }

    @PostMapping("/downInvoice")
    @Operation(summary = "发票下载")
    public Result<String> getInvoiceUrl(){
        return  Result.error();
    }
}
