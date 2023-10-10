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
@RequestMapping("/dic")
@Api(tags = "字典接口")
public class DicController extends IController {

    @GetMapping("/list")
    @ApiOperation("字典列表")
    public Result<String> dicList() {
        return Result.error();
    }

    @GetMapping("/save")
    @ApiOperation("保存字典")
    public Result<String> saveDic() {
        return Result.error();
    }

    @GetMapping("/detail")
    @ApiOperation("字典详情")
    public Result<String> dicDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @ApiOperation("删除字典")
    public Result<String> deleteDic() {
        return Result.error();
    }

}
