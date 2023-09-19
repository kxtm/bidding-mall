package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */

@RestController
@RequestMapping("/user")
@Api("用户模块")
public class UserController extends IController {
}
