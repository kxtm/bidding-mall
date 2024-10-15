package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//需求接口
@RestController
@RequestMapping("/require")
public class RequireController extends IController {


    //需求列表
    @GetMapping("/list")
    public Result<String> requireList() {
        return Result.error();
    }

    //保存需求
    @PostMapping("/save")
    public Result<String> addRequire() {

        return Result.error();
    }

    //需求详情
    @GetMapping("/detail")
    public Result<String> requireDetail() {
        return Result.error();
    }


    //删除需求
    @PostMapping("/delete")
    public Result<String> deleteRequire() {
        return Result.error();
    }
}
