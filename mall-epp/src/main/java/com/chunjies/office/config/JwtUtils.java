package com.chunjies.office.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

import java.util.Date;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/5
 * {@code @description}
 */
public class JwtUtils {
    private static final String secret = "test123456";

    /**
     * @Author HJJ
     * @Date 2022-12-28 16:59
     * @Params userId，userName
     * @Return token
     * @Description 创建Token，默认时间为7天
     */
    public static String auth(String userName, String authentications) {
        long expire = 7 * 24 * 3600 * 1000;
        return JWT.create().withAudience(userName)
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + expire))
                .withClaim("username", userName)
                .withClaim("authentications", authentications)
                .sign(Algorithm.HMAC512(userName + secret));
    }

    /**
     * @Author HJJ
     * @Date 2022-12-28 16:59
     * @Params token, userName
     * @Return boolean
     * @Description 验证Token，过期或不正确时会返回false
     */
    public static boolean verify(String token, String userName) {
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC512(userName + secret)).build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println(jwt.getClaim("username").asString());
            return jwt.getClaim("username").asString().equals(userName);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static void main(String[] args) {
        String token = auth("admin", "aaaaaaaaaaaaaaaaaa");
        System.out.println(token);
        verify(token, "admin");
    }
}
