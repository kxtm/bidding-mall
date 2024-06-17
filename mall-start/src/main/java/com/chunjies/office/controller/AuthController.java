package com.chunjies.office.controller;

import com.chunjies.office.common.cache.RedisCache;
import com.chunjies.office.common.core.IController;
import com.chunjies.office.common.core.Result;
import com.chunjies.office.domain.request.LoginDto;
import com.wf.captcha.GifCaptcha;
import com.wf.captcha.base.Captcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
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
public class AuthController extends IController {

    private RedisCache redisCache;

    //用户登录
    @PostMapping("/login")

    public Result<String> login(@Valid @RequestBody LoginDto loginDto) {
        String key = UUID.randomUUID().toString();
        redisCache.setCacheObject(key, "A", 1800, TimeUnit.SECONDS);
        return Result.ok("成功", key);
    }

    //验证码
    @GetMapping("/captcha")
    public Result<String> captcha(HttpServletRequest request) throws IOException {
        GifCaptcha gifCaptcha = new GifCaptcha(100, 48, 4);
        // 设置类型：字母数字混合
        gifCaptcha.setCharType(Captcha.TYPE_DEFAULT);
        request.getSession().setAttribute("captcha", gifCaptcha.text());
        return Result.ok(gifCaptcha.toBase64());
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
