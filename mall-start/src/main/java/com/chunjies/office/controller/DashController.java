package com.chunjies.office.controller;

import com.chunjies.office.core.core.IController;
import com.chunjies.office.core.core.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author:} chunjie
 * {@code @date:} 2023-09-15 22:23
 **/

@RestController
@Tag(name = "仪表盘")
@RequestMapping("/dashBoard")
public class DashController extends IController {

    @GetMapping("/user")
    @Operation(summary = "用户仪表盘")
    public Result<String> userBoard() {

        return Result.error();
    }

    @GetMapping("/system")
    @Operation(summary = "管理员仪表盘")
    public Result<String> adminBoard() {
        return Result.error();
    }

}
