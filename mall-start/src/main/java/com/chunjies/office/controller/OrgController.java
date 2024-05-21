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
@RequestMapping("/org")
@Tag(name = "机构接口")
public class OrgController extends IController {

    @GetMapping("/list")
    @Operation(summary ="第一层节点")
    public Result<String> orgList() {
        return Result.error();
    }

    @GetMapping("/child")
    @Operation(summary ="机构子节点")
    public Result<String> childOrg() {
        return Result.error();
    }

    @GetMapping("/save")
    @Operation(summary ="保存机构")
    public Result<String> addOrg() {
        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary ="机构详情")
    public Result<String> orgDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary ="删除机构")
    public Result<String> deleteOrg() {
        return Result.error();
    }


}
