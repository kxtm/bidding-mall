package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author:} chunjie
 * {@code @date:} 2023-09-15 22:23
 **/

@RestController
@Api("仪表盘模块")
@RequestMapping("/api/dash")
public class DashController extends IController {

    @GetMapping("/userDash")
    public Result userBoard() {

        return Result.error();
    }

}
