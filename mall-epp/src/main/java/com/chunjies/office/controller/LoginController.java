package com.chunjies.office.controller;

import com.chunjies.office.core.base.IController;
import com.chunjies.office.core.utils.JwtUtils;
import com.chunjies.office.core.base.Result;
import com.chunjies.office.form.LoginForm;
import com.wf.captcha.GifCaptcha;
import com.wf.captcha.base.Captcha;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/7
 * {@code @description}
 */
@RestController
@RequestMapping("/auth")
@Api(tags = "登录接口")
public class LoginController extends IController {

    @PostMapping("/login")
    @ApiOperation("用户登录")
    public Result<String> login(@Validated @RequestBody LoginForm loginForm, @ApiIgnore HttpSession session, @ApiIgnore HttpServletResponse response) {
        String token = JwtUtils.auth("admin", "");
        response.addHeader("token", token);
        session.setAttribute("user", "admin");
        return Result.ok("成功", token);
    }

    @GetMapping("/captcha")
    @ApiOperation("验证码")
    public void captcha(@ApiIgnore HttpSession session, @ApiIgnore HttpServletResponse response) throws IOException {
        GifCaptcha gifCaptcha = new GifCaptcha(100, 48, 4);
        // 设置类型：字母数字混合
        gifCaptcha.setCharType(Captcha.TYPE_DEFAULT);
        //获取验证码
        session.setAttribute("code", gifCaptcha.text().toLowerCase());
        response.setContentType("image/gif");
        gifCaptcha.out(response.getOutputStream());
        response.getOutputStream().close();
    }


    @GetMapping("/logOut")
    @ApiOperation("用户退出")
    public Result<String> logOut() {

        return Result.error();
    }
}
