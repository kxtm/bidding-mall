package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/require")
@Api(tags = "需求接口")
public class RequireController extends IController {


    @GetMapping("/list")
    @ApiOperation("需求列表")
    public Result<String> requireList() {

        return Result.error();
    }
}
