package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@Api(tags = "收货地址")
public class AddressController extends IController {


    @GetMapping("/list")
    @ApiOperation("获取地址列表")
    public Result<String> addressList() {

        return Result.error();
    }
}
