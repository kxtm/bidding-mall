package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公告管理
 * {@code @author} chunjie
 * {@code @time} 2023/10/5
 * {@code @description}
 */
@RestController
@RequestMapping("/notice")
public class NoticeController extends IController {


    //公告列表
    @GetMapping("/list")
    public Result<String> noticeList() {
        return Result.error();
    }

    //保存公告
    @PostMapping("/save")
    public Result<String> addNotice() {

        return Result.error();
    }

    //公告详情
    @GetMapping("/detail")
    public Result<String> noticeDetail() {
        return Result.error();
    }

    //删除公告
    @PostMapping("/delete")
    public Result<String> deleteNotice() {
        return Result.error();
    }
}
