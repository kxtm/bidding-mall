package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户接口
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */

@RestController
@RequestMapping("/user")
public class UserController extends IController {


    //用户列表
    @GetMapping("/list")
    public Result<String> userList() {
        return Result.error();
    }

    //保存用户
    @PostMapping("/save")
    public Result<String> saveUser() {
        return Result.error();
    }


    //用户详情
    @GetMapping("/query")
    public Result<String> userDetail() {
        return Result.error();
    }


    //删除用户
    @PostMapping("/delete")
    public Result<String> deleteUser() {
        return Result.error();
    }


    //查询用户部门
    @PostMapping("/queryDept")
    public Result<String> queryUserDept() {
        return Result.error();
    }

    //保存用户部门
    @PostMapping("/saveDept")
    public Result<String> saveUserDept() {
        return Result.error();
    }


    /**
     * 保存用户角色
     */
    @PostMapping("/queryRole")
    public Result<String> queryUserRole() {
        return Result.error();
    }

    /**
     * 保存用户角色
     */
    @PostMapping("/saveRole")
    public Result<String> saveUserRole() {
        return Result.error();
    }


}
