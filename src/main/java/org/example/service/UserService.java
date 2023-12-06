package org.example.service;

import org.example.pojo.User;

/**
 * projectName:SpringBoot_big-event
 * author:HuShanTao
 * time:2023/12/5 20:10
 * description:
 */
public interface UserService {
    //根据用户名查询用户
    User findByUserName(String username);

    //注册
    void register(String username, String password);
}
