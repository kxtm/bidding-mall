package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/org")
@Api(tags = "机构接口")
public class OrganController extends IController {

    @GetMapping("/list")
    @ApiOperation("第一层节点")
    public Result<String> getOrg() {
        return Result.error();
    }
}
