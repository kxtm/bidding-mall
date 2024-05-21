package com.chunjies.office.controller;

import com.chunjies.office.core.core.IController;
import com.chunjies.office.core.core.Result;
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
