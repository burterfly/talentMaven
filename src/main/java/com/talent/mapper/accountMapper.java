package com.talent.mapper;

import com.talent.entity.account;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface accountMapper {

    //用户登录
    account userlogin(@Param("username") String username,@Param("password") String password);

    //注册新用户(方式1)
    int adduser(@Param("username") String username, @Param("password") String password, @Param("age") int age);

    //注册新用户（方式2）
    int adduser1(@Param("username") String username, @Param("password") String password, @Param("age") int age);

    //查询用户列表
    List<Map<String,Object>> queryAllUser();;
}