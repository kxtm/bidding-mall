package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//科目-用途
@RestController
@RequestMapping("/subject")
public class SubjectController extends IController {


    //科目-用途列表
    @GetMapping("/list")
    public Result<String> subjectList() {
        return Result.error();
    }


    //保存科目-用途
    @PostMapping("/save")
    public Result<String> addSubject() {
        return Result.error();
    }

    //科目-用途详情
    @GetMapping("/detail")
    public Result<String> subjectDetail() {
        return Result.error();
    }

    //删除科目-用途
    @PostMapping("/delete")
    public Result<String> deleteSubject() {
        return Result.error();
    }

}
