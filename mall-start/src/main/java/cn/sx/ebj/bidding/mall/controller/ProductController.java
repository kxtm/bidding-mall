package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//商品接口
@RestController
@RequestMapping("/prod")
public class ProductController extends IController {


    //商品列表
    @GetMapping("/list")
    public Result<String> ProductList() {

        return Result.error();
    }

    //保存商品
    @PostMapping("/save")
    public Result<String> addProduct() {
        return Result.error();
    }

    //商品详情
    @GetMapping("/detail")
    public Result<String> productDetail() {
        return Result.error();
    }

    //删除商品
    @PostMapping("/delete")
    public Result<String> deleteProduct() {
        return Result.error();
    }
}
