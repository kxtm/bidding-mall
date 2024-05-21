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
@RequestMapping("/subject")
@Tag(name = "科目\\用途")
public class SubjectController extends IController {

    @GetMapping("/list")
    @Operation(summary = "科目\\用途列表")
    public Result<String> subjectList() {
        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary = "保存科目\\用途")
    public Result<String> addSubject() {
        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary = "科目\\用途详情")
    public Result<String> subjectDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary = "删除科目\\用途")
    public Result<String> deleteSubject() {
        return Result.error();
    }

}
