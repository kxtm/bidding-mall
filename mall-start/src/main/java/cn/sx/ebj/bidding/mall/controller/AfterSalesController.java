package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//售后服务
@RestController
@RequestMapping("/AfterSales")
public class AfterSalesController extends IController {


    //售后列表
    @GetMapping("/list")
    public Result<String> afterSalesList() {

        return Result.error();
    }

}
