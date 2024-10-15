package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//字典接口
@RestController
@RequestMapping("/dic")
public class DicController extends IController {


    //字典列表
    @GetMapping("/list")
    public Result<String> dicList() {
        return Result.error();
    }

    //保存字典
    @GetMapping("/save")
    public Result<String> saveDic() {
        return Result.error();
    }

    //字典详情
    @GetMapping("/detail")
    public Result<String> dicDetail() {
        return Result.error();
    }


    //删除字典
    @PostMapping("/delete")
    public Result<String> deleteDic() {
        return Result.error();
    }

}
