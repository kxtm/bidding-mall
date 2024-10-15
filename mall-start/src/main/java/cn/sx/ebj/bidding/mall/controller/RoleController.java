package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色接口
 * {@code @author} chunjie
 * {@code @time} 2023/10/5
 * {@code @description}
 */

@RestController
@RequestMapping("/role")
public class RoleController extends IController {

    //角色列表
    @GetMapping("/list")
    public Result<String> roleList() {

        return Result.error();
    }

    //保存角色
    @PostMapping("/save")
    public Result<String> addRole() {
        return Result.error();
    }

    //角色详情
    @GetMapping("/detail")
    public Result<String> roleDetail() {
        return Result.error();
    }

    //删除角色
    @PostMapping("/delete")
    public Result<String> deleteRole() {
        return Result.error();
    }

    //保存角色分类
    @PostMapping("/saveCategory")
    public Result<String> saveRoleCategory() {
        return Result.error();
    }

}
