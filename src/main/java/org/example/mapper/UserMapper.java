package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

/**
 * projectName:SpringBoot_big-event
 * author:HuShanTao
 * time:2023/12/5 20:11
 * description:
 */
@Mapper
public interface UserMapper {
    //根据用户名查询用户
    @Select(" select * from user where username=#{username}")
    User findByUserName(String username);

    //添加
    @Insert("insert into user (username,password,create_time,update_time) values (#{username},#{password},now(),now()); ")
    void add(String username, String password);
}
