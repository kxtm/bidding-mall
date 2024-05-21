package com.chunjies.office.controller;

import com.chunjies.office.core.core.IController;
import com.chunjies.office.core.core.Result;
import com.chunjies.office.service.IOrderFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //商城门户
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */
@RestController

@RequestMapping("/portal")
public class IndexController extends IController {
    private IOrderFace orderFace;

    //获取首页数据
    @GetMapping("/getData")
    public Result<?> index() {
        return orderFace.createOrder();
    }

    @Autowired
    public void setOrderFace(IOrderFace orderFace) {
        this.orderFace = orderFace;
    }

}
