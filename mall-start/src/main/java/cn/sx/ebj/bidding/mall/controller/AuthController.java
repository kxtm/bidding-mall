package cn.sx.ebj.bidding.mall.controller;

import cn.sx.ebj.bidding.mall.core.cache.RedisCache;
import cn.sx.ebj.bidding.mall.core.consts.Constr;
import cn.sx.ebj.bidding.mall.core.base.IController;
import cn.sx.ebj.bidding.mall.core.base.Result;
import cn.sx.ebj.bidding.mall.domain.request.LoginDto;
import com.wf.captcha.GifCaptcha;
import com.wf.captcha.base.Captcha;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
public class AuthController extends IController {

    private RedisCache redisCache;

    //用户登录
    @PostMapping("/login")

    public Result<String> login(@Valid @RequestBody LoginDto loginDto) {
        String key = UUID.randomUUID().toString();
        redisCache.setCacheObject(key, "A", 1800, TimeUnit.SECONDS);
        return Result.ok(key);
    }

    //验证码
    @GetMapping("/captcha")
    public Result<String> captcha(HttpSession session) throws IOException {
        GifCaptcha gifCaptcha = new GifCaptcha(100, 48, 4);
        // 设置类型：字母数字混合
        gifCaptcha.setCharType(Captcha.TYPE_DEFAULT);
        session.setAttribute(Constr.CAPTCHA, gifCaptcha);
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
