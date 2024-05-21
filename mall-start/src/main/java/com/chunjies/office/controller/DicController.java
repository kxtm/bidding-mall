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
@RequestMapping("/dic")
@Tag(name = "字典接口")
public class DicController extends IController {

    @GetMapping("/list")
    @Operation(summary = "字典列表")
    public Result<String> dicList() {
        return Result.error();
    }

    @GetMapping("/save")
    @Operation(summary = "保存字典")
    public Result<String> saveDic() {
        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary = "字典详情")
    public Result<String> dicDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary = "删除字典")
    public Result<String> deleteDic() {
        return Result.error();
    }

}
