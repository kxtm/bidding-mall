package com.chunjies.office.controller;

import com.chunjies.office.core.cache.RedisCache;
import com.chunjies.office.core.core.IController;
import com.chunjies.office.core.core.Result;
import com.chunjies.office.core.utils.JwtUtils;
import com.chunjies.office.domain.LoginDto;
import com.wf.captcha.GifCaptcha;
import com.wf.captcha.base.Captcha;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 登录接口
 * {@code @author} chunjie
 * {@code @time} 2023/10/7
 * {@code @description}
 */
@RestController
@RequestMapping("/auth")
public class LoginController extends IController {

    private RedisCache redisCache;

    //用户登录
    @PostMapping("/login")
    @Validated
    public Result<String> login(@RequestBody LoginDto loginForm, HttpServletResponse response) {
        String token = JwtUtils.auth(loginForm.getUserName(), "");
        String key = UUID.randomUUID().toString();
        response.addHeader("token", token);
        redisCache.setCacheObject(key, token, 1800, TimeUnit.SECONDS);
        return Result.ok("成功", key);
    }

    //验证码
    @GetMapping("/captcha")
    public void captcha(HttpSession session, HttpServletResponse response) throws IOException {
        GifCaptcha gifCaptcha = new GifCaptcha(100, 48, 4);
        // 设置类型：字母数字混合
        gifCaptcha.setCharType(Captcha.TYPE_DEFAULT);
        //获取验证码
        session.setAttribute("code", gifCaptcha.text().toLowerCase());
        response.setContentType("image/gif");
        gifCaptcha.out(response.getOutputStream());
        response.getOutputStream().close();
    }


    //用户退出
    @GetMapping("/logOut")
    public Result<String> logOut() {

        return Result.error();
    }


    @Autowired
    public void setRedisCache(RedisCache redisCache) {
        this.redisCache = redisCache;
    }
}
