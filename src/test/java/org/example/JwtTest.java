package org.example;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * projectName:SpringBoot_big-event
 * author:HuShanTao
 * time:2023/12/7 19:53
 * description:测试令牌
 */
public class JwtTest {
    @Test
    public void testGen(){
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("id",1);
        hashMap.put("username","tom");
        //生成jwt的代码
        String token = JWT.create()
                .withClaim("user", hashMap)
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 12))
                .sign(Algorithm.HMAC256("xiaohu"));
        System.out.println(token);
    }

    @Test
    public void testParse(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                ".eyJ1c2VyIjp7ImlkIjoxLCJ1c2VybmFtZSI6InRvbSJ9LCJleHAiOjE3MDE5OTM5MzB9" +
                ".JjAgwH9_F2jsVkWWNfOhwM9SZ1euQU44q_hkb76KJ-0";
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("xiaohu")).build();
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        Map<String, Claim> claims = decodedJWT.getClaims();
        System.out.println(claims.get("user"));
    }
}
