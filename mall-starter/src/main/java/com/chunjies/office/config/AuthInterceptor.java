package com.chunjies.office.config;


import com.chunjies.office.core.utils.JsonUtil;
import com.chunjies.office.core.utils.JwtUtils;
import com.chunjies.office.core.base.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/7
 * {@code @description}
 */
public class AuthInterceptor implements HandlerInterceptor {

    final Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, @NonNull HttpServletResponse resp,@NonNull Object handler) throws Exception {
        logger.error("请求地址{}", request.getRequestURI());
        String token = request.getHeader("token");
        String user = (String) request.getSession().getAttribute("user");
        if (ObjectUtils.isEmpty(token) || ObjectUtils.isEmpty(user)) {
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("application/json; charset=utf-8");
            resp.getWriter().println(JsonUtil.objectToJson(Result.error("无权限访问")));
            resp.getWriter().close();
            return false;
        }
        if (!ObjectUtils.isEmpty(token) && !JwtUtils.verify(token, user)) {
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("application/json; charset=utf-8");
            resp.getWriter().println(JsonUtil.objectToJson(Result.error("授权已过期")));
            resp.getWriter().close();
            return false;
        }
        return true;
    }
}
