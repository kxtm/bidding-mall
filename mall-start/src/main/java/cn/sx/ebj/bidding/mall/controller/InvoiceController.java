package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//发票接口
@RestController
@RequestMapping("/invoice")
public class InvoiceController extends IController {


    //发票列表
    @GetMapping("/list")
    public Result<String> invoiceList() {

        return Result.error();
    }

    //保存发票
    @PostMapping("/save")
    public Result<String> saveInvoiceInfo() {
        return Result.error();
    }

    //发票详情
    @GetMapping("/detail")
    public Result<?> getInvoiceDetail() {

        return Result.error();
    }

    //删除发票明细
    @PostMapping("/delete")
    public Result<String> deleteInvoiceInfo() {
        return Result.error();
    }


    //发票申请列表
    @GetMapping("/applyList")
    public Result<?> getInvoiceApplyList() {

        return Result.error();
    }


    //保存开票申请
    @PostMapping("/saveApply")
    public Result<String> saveInvoiceApply() {
        return Result.error();
    }


    //获取开票申请详情
    public Result<?> getInvoiceApplyDetail() {
        return Result.error();
    }

    //删除开票申请
    @PostMapping("/delteApply")
    public Result<String> deleteInvoiceApply() {
        return Result.error();
    }

    //发票下载
    @PostMapping("/downInvoice")
    public Result<String> getInvoiceUrl() {
        return Result.error();
    }
}
