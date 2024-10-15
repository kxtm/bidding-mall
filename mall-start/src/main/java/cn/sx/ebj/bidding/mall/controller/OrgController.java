package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//机构接口
@RestController
@RequestMapping("/org")
public class OrgController extends IController {


    //第一层节点
    @GetMapping("/list")
    public Result<String> orgList() {
        return Result.error();
    }


    //机构子节点
    public Result<String> childOrg() {
        return Result.error();
    }

    //保存机构
    @GetMapping("/save")
    public Result<String> addOrg() {
        return Result.error();
    }

    //机构详情
    @GetMapping("/detail")
    public Result<String> orgDetail() {
        return Result.error();
    }

    //删除机构
    @PostMapping("/delete")
    public Result<String> deleteOrg() {
        return Result.error();
    }


}
