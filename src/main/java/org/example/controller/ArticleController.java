package org.example.controller;

import org.example.pojo.Result;
import org.example.utils.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * projectName:SpringBoot_big-event
 * author:HuShanTao
 * time:2023/12/6 8:59
 * description:
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @GetMapping("/list")
    public Result<String> list(/*@RequestHeader (name = "Authorization") String token, HttpServletResponse response*/) {
        //验证token
        /*try {
            Map<String, Object> claims = JwtUtil.parseToken(token);
            return Result.success("所有文章数据。。。");
        } catch (Exception e) {
            //设置HTTP响应码为401
            response.setStatus(401);
            return Result.error("未登录");
        }*/
        return Result.success("所有文章数据。。。");
    }
}
