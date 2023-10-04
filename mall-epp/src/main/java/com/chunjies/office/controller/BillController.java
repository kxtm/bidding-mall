package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
@Api(tags = "账单接口")
public class BillController extends IController {
    @GetMapping("/list")
    @ApiOperation("用户账单列表")
    public Result<String> billList(){

        return Result.error();
    }
}
