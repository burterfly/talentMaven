package com.talent.service;


import com.talent.mapper.accountMapper;
import com.talent.entity.account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserLoginService {

    /**
     * 注入dao
     */
    @Autowired
    private accountMapper usermapper;

    //用户登录
    public account userLogin(String username, String password){
        account user = usermapper.userlogin(username,password);
        return user;
    }

    //注册新用户
    public int adduser(String username,String password,int age){

        //return usermapper.adduser(username,password,age);
        return usermapper.adduser1(username,password,age);     //对应sql语句中的第二种注册方式
    }
    //查询用户列表
    public List<Map<String,Object>> queryAllUser(){
        return usermapper.queryAllUser();
    }
}
