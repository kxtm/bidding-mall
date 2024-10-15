package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//订单接口
@RestController
@RequestMapping("/order")
public class OrderController extends IController {


    //订单列表
    @GetMapping("/list")
    public Result<String> orderList() {
        return Result.error();
    }

    //保存订单
    @PostMapping("/save")
    public Result<String> saveOrder() {
        return Result.error();
    }

    //订单详情
    public Result<String> orderDetail() {
        return Result.error();
    }

    //删除订单
    @GetMapping("/delete")
    public Result<String> deleteOrder() {
        return Result.error();
    }
}
