package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/5
 * {@code @description}
 */
@RestController
@RequestMapping("/notice")
@Api(tags = "公告管理")
public class NoticeController extends IController {


    @GetMapping("/list")
    @ApiOperation("公告列表")
    public Result<String> noticeList() {
        return Result.error();
    }

    @PostMapping("/save")
    @ApiOperation("保存公告")
    public Result<String> addNotice() {

        return Result.error();
    }
}
