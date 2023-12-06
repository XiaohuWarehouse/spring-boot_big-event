package org.example.controller;

import org.example.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Result<String> list() {
        return Result.success("所有文章数据。。。");
    }
}
