package com.chunjies.office.controller;

import com.chunjies.office.common.core.IController;
import com.chunjies.office.common.core.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//预算接口
@RestController
@RequestMapping("/budget")
public class BudgetController extends IController {


    //预算列表
    @GetMapping("/list")
    public Result<String> budgetList() {
        return Result.error();
    }


    //保存预算
    @PostMapping("/save")
    public Result<String> saveBudget() {
        return Result.error();
    }


    //保存预算
    @PostMapping("/detail")
    public Result<String> budgetDetail() {
        return Result.error();
    }


    //删除预算
    @PostMapping("/delete")
    public Result<String> deleteBudget() {
        return Result.error();
    }
}
