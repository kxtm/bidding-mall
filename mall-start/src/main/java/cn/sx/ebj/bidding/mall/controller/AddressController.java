package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//收货地址
@RestController
@RequestMapping("/address")
public class AddressController extends IController {


    //获取地址列表
    @GetMapping("/list")
    public Result<String> addressList() {

        return Result.error();
    }

    //保存地址
    @PostMapping("/save")
    public Result<String> saveAddress() {
        return Result.error();
    }

    //地址详情
    @GetMapping("/detail")
    public Result<String> addressDetail() {

        return Result.error();
    }

    //删除地址
    @PostMapping("/delete")
    public Result<String> deleteAddress() {
        return Result.error();
    }
}
