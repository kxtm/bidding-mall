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
@RequestMapping("/subject")
@Api(tags = "科目\\用途接口")
public class SubjectController extends IController {

    @GetMapping("/list")
    @ApiOperation("查询科目\\用途列表")
    public Result<String> subjectList() {
        return Result.error();
    }

    @PostMapping("/save")
    @ApiOperation("保存科目\\用途")
    public Result<String> addSubject() {
        return Result.error();
    }

    @GetMapping("/detail")
    @ApiOperation("科目\\用途详情")
    public Result<String> subjectDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @ApiOperation("删除科目\\用途")
    public Result<String> deleteSubject() {
        return Result.error();
    }

}
