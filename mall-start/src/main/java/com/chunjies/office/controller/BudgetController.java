package com.chunjies.office.controller;

import com.chunjies.office.core.core.IController;
import com.chunjies.office.core.core.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/budget")
@Tag(name = "预算接口")
public class BudgetController extends IController {

    @GetMapping("/list")
    @Operation(summary ="预算列表")
    public Result<String> budgetList() {
        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary ="保存预算")
    public Result<String> saveBudget() {
        return Result.error();
    }

    @PostMapping("/detail")
    @Operation(summary ="保存预算")
    public Result<String> budgetDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary ="删除预算")
    public Result<String> deleteBudget() {
        return Result.error();
    }
}
