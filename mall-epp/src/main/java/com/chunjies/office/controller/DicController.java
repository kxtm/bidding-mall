package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/dic")
@Api(tags ="字典设置")
public class DicController extends IController {
}
