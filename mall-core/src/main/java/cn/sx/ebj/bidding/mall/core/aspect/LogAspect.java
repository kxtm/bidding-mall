package cn.sx.ebj.bidding.mall.core.aspect;

import cn.sx.ebj.bidding.mall.core.annotations.Operate;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {


    Logger logger = LoggerFactory.getLogger(getClass());

    @Around("@annotation(operate)")
    public Object around(ProceedingJoinPoint joinPoint, Operate operate) throws Throwable {
        logger.info("请求参数：{}", operate.desc());
        Object[] args = joinPoint.getArgs();
        logger.info("请求参数：{}", args);
        Object proceed = joinPoint.proceed(args);
        logger.info("返回结果:{}", proceed);
        return proceed;
    }
}
