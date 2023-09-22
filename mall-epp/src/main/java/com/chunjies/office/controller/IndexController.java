package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.Result;
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
@Api(tags = "商城首页")
@RequestMapping("/api")
public class IndexController extends IController {
    private IOrderFace orderFace;

    @GetMapping("/")
    @ApiOperation("获取数据")
    public Result index() {
        return orderFace.createOrder();
    }

    @Autowired
    public void setOrderFace(IOrderFace orderFace) {
        this.orderFace = orderFace;
    }

}
