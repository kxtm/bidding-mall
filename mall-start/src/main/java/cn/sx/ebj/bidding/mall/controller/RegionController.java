package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 地区接口
 * {@code @author} chunjie
 * {@code @time} 2023/10/7
 * {@code @description}
 */


@RestController
@RequestMapping("/region")
public class RegionController extends IController {

    //省直辖市
    @GetMapping("/province")
    public Result<String> provinceList() {
        return Result.error();
    }

    //子节点获取
    @GetMapping("/child")
    public Result<String> childArea() {
        return Result.error();
    }

    //地级市、区
    @GetMapping("/city")
    public Result<String> cityList() {
        return Result.error();
    }

    //县级单位
    @GetMapping("/county")
    public Result<String> countyList() {
        return Result.error();
    }

    //乡镇街道村等
    @GetMapping("/area")
    public Result<String> areaList() {
        return Result.error();
    }


}
