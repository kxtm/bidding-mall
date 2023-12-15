package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/7
 * {@code @description}
 */

@RestController
@RequestMapping("/region")
@Tag(name = "地区接口")
public class RegionController extends IController {

    @GetMapping("/province")
    @Operation(summary ="省直辖市")
    public Result<String> provinceList() {
        return Result.error();
    }

    @GetMapping("/child")
    @Operation(summary ="子节点获取")
    public Result<String> childArea() {
        return Result.error();
    }

    @GetMapping("/city")
    @Operation(summary ="地级市、区")
    public Result<String> cityList() {
        return Result.error();
    }

    @GetMapping("/county")
    @Operation(summary ="县级单位")
    public Result<String> countyList() {
        return Result.error();
    }

    @GetMapping("/area")
    @Operation(summary ="乡镇街道村等")
    public Result<String> areaList() {
        return Result.error();
    }


}
