package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//账单接口
@RestController
@RequestMapping("/bill")
public class BillController extends IController {


    //用户账单列表
    @GetMapping("/list")
    public Result<String> billList() {

        return Result.error();
    }
}
