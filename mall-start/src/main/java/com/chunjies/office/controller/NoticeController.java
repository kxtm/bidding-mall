package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "公告管理")
public class NoticeController extends IController {


    @GetMapping("/list")
    @Operation(summary = "公告列表")
    public Result<String> noticeList() {
        return Result.error();
    }

    @PostMapping("/save")
    @Operation(summary = "保存公告")
    public Result<String> addNotice() {

        return Result.error();
    }

    @GetMapping("/detail")
    @Operation(summary = "公告详情")
    public Result<String> noticeDetail() {
        return Result.error();
    }

    @PostMapping("/delete")
    @Operation(summary = "删除公告")
    public Result<String> deleteNotice() {
        return Result.error();
    }
}
