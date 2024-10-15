package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author:} chunjie
 * {@code @date:} 2023-09-15 22:23
 **/

//仪表盘
@RestController
@RequestMapping("/dashBoard")
public class DashController extends IController {


    //用户仪表盘
    @GetMapping("/user")
    public Result<String> userBoard() {

        return Result.error();
    }


    //管理员仪表盘
    @GetMapping("/system")
    public Result<String> adminBoard() {
        return Result.error();
    }

}
