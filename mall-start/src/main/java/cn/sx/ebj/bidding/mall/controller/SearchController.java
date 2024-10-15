package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//搜索相关
@RestController
@RequestMapping("/search")
public class SearchController extends IController {


    //搜索
    @GetMapping("/")
    public Result<?> searchResult() {

        return Result.error();
    }

}
