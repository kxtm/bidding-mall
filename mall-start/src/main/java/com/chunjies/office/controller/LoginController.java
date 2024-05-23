package com.chunjies.office.controller;

import com.chunjies.office.common.cache.RedisCache;
import com.chunjies.office.common.core.IController;
import com.chunjies.office.common.core.Result;
import com.chunjies.office.domain.LoginDto;
import com.wf.captcha.GifCaptcha;
import com.wf.captcha.base.Captcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
public class LoginController extends IController {

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
