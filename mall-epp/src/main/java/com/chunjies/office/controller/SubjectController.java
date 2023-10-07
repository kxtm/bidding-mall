package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
@Api(tags = "科目或用途接口")
public class SubjectController extends IController {

    @GetMapping("/list")
    @ApiOperation("科目或用途列表")
    public Result<String> subjectList(){
        return Result.error();
    }

}
