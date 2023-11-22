package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import com.chunjies.office.domain.AgreementCategoryDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agreement")
@Api(tags = "协议管理")
public class AgreementController extends IController {
    @GetMapping("/list")
    @ApiOperation("协议列表")
    public Result<String> agreementList() {

        return Result.error();
    }

    @PostMapping("/save")
    @ApiOperation("保存协议")
    public Result<String> addAgreement() {
        return Result.error();
    }


    @GetMapping("/query")
    @ApiOperation("查询协议")
    public Result<String> queryAgreement() {

        return Result.error();
    }

    @PostMapping("/delete")
    @ApiOperation("删除协议")
    public Result<String> deleteAgreement() {
        return Result.error();
    }


    //保存协议与分类关系

    @PostMapping("/saveCategory")
    @ApiOperation("保存协议分类")
    public Result<String> saveAgreeCategory(@Validated @RequestBody AgreementCategoryDto agreementCategoryDto) {

        return Result.error();
    }


}
