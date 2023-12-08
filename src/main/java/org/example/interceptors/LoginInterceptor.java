package org.example.interceptors;

import org.example.pojo.Result;
import org.example.utils.JwtUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * projectName:SpringBoot_big-event
 * author:HuShanTao
 * time:2023/12/8 8:27
 * description:拦截器
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //令牌验证
        String token = request.getHeader("Authorization");
        //验证token
        try {
            Map<String, Object> claims = JwtUtil.parseToken(token);
            return true;
        } catch (Exception e) {
            //设置HTTP响应码为401
            response.setStatus(401);
            return false;
        }
    }
}
