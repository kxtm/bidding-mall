package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.base.Result;
import com.chunjies.office.service.IOrderFace;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */
@RestController
@Api(tags = "商城门户")
@RequestMapping("/portal")
public class IndexController extends IController {
    private IOrderFace orderFace;

    @GetMapping("/getData")
    @ApiOperation("获取首页数据")
    public Result<String> index() {
        return orderFace.createOrder();
    }

    @Autowired
    public void setOrderFace(IOrderFace orderFace) {
        this.orderFace = orderFace;
    }

}
