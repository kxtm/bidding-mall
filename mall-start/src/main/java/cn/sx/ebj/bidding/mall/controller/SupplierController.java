package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//供应商
@RestController
@RequestMapping("/supplier")
public class SupplierController extends IController {

    //供应商列表
    @GetMapping("/list")
    public Result<String> supplierList() {
        return Result.error();
    }

    //查询供应商
    @GetMapping("/query")
    public Result<String> querySupplier() {
        return Result.error();
    }

    //保存供应商
    @PostMapping("/save")
    public Result<String> saveSupplier() {
        return Result.error();
    }

    //删除供应商
    @PostMapping("/delete")
    public Result<String> deleteSupplier() {
        return Result.error();
    }

    //保存登录账户
    @PostMapping("/saveAccount")
    public Result<String> saveSupplierAccount() {
        return Result.error();
    }


}
