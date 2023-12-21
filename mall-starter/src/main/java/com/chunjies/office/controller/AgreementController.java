package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import com.chunjies.office.domain.AgreeCateDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agreement")
@Tag(name = "协议管理")
public class AgreementController extends IController {
    @GetMapping("/list")
    @Operation(summary = "协议列表")
    public Result<String> agreementList() {

        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary = "保存协议")
    public Result<String> addAgreement() {
        return Result.error();
    }


    @GetMapping("/query")
    @Operation(summary = "查询协议")
    public Result<String> queryAgreement() {

        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary = "删除协议")
    public Result<String> deleteAgreement() {
        return Result.error();
    }


    //保存协议与分类关系

    @PostMapping("/saveCategory")
    @Operation(summary = "保存协议分类")
    public Result<String> saveAgreeCategory(@Validated @RequestBody AgreeCateDto agreeCateDto) {

        return Result.error();
    }


}
