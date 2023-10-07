package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/budget")
@Api(tags = "预算接口")
public class BudgetController extends IController {

    @GetMapping("/list")
    @ApiOperation("预算列表")
    public Result<String> budgetList(){
        return Result.error();
    }
}
