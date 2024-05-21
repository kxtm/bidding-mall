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
@RequestMapping("/require")
@Tag(name = "需求接口")
public class RequireController extends IController {


    @GetMapping("/list")
    @Operation(summary = "需求列表")
    public Result<String> requireList() {
        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary = "保存需求")
    public Result<String> addRequire() {

        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary = "需求详情")
    public Result<String> requireDetail() {
        return Result.error();
    }


    @PostMapping("/delete")
    @Operation(summary = "删除需求")
    public Result<String> deleteRequire() {
        return Result.error();
    }
}
