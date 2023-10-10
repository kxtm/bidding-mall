package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/org")
@Api(tags = "机构接口")
public class OrganController extends IController {

    @GetMapping("/list")
    @ApiOperation("第一层节点")
    public Result<String> orgList() {
        return Result.error();
    }

    @GetMapping("/child")
    @ApiOperation("机构子节点")
    public Result<String> childOrg() {
        return Result.error();
    }

    @GetMapping("/save")
    @ApiOperation("保存机构")
    public Result<String> addOrg() {
        return Result.error();
    }

    @GetMapping("/detail")
    @ApiOperation("机构详情")
    public Result<String> orgDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @ApiOperation("删除机构")
    public Result<String> deleteOrg() {
        return Result.error();
    }


}
