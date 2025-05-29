package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//商品分类
@RestController
@RequestMapping("/category")
public class CategoryController extends IController {


    //查询一级商品分类
    @GetMapping("/list")
    public Result<String> categoryList() {
        return Result.error();
    }

    //查询子级分类
    @GetMapping("/queryChild")
    public Result<String> childCategory() {
        return Result.error();
    }

    //保存分类
    @PostMapping("/save")
    public Result<String> addCategory() {
        return Result.error();
    }

    //分类详情
    @GetMapping("/detail")
    public Result<String> cateDetail() {
        return Result.error();
    }


    //删除分类
    @PostMapping("/delete")
    public Result<String> deleteCategory() {
        return Result.error();
    }
}
