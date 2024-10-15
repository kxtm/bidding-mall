package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import cn.sx.ebj.bidding.mall.domain.response.AgreeCateDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


//协议管理
@RestController
@RequestMapping("/agreement")
public class AgreementController extends IController {


    //协议列表
    @GetMapping("/list")
    public Result<String> agreementList() {

        return Result.error();
    }


    //保存协议
    @PostMapping("/save")
    public Result<String> addAgreement() {
        return Result.error();
    }


    //查询协议
    @GetMapping("/query")
    public Result<String> queryAgreement() {

        return Result.error();
    }


    //删除协议
    @PostMapping("/delete")
    public Result<String> deleteAgreement() {
        return Result.error();
    }


    //保存协议与分类关系 保存协议分类
    @PostMapping("/saveCategory")
    public Result<String> saveAgreeCategory(@Validated @RequestBody AgreeCateDto agreeCateDto) {

        return Result.error();
    }


}
