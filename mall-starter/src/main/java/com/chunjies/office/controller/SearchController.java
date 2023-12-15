package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
@Tag(name = "搜索相关")
public class SearchController extends IController {

    @GetMapping("/")
    @Operation(summary = "搜索")
    public Result<?> searchResult() {

        return Result.error();
    }

}
