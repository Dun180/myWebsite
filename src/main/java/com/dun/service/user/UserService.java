package com.dun.service.user;

import com.dun.pojo.User;

import java.util.List;

public interface UserService {
    //用户登录
    public User login(String username, String password);

    //用户注册
    public boolean register(User user);

    //根据条件查询用户列表
    public List<User> getUserList(String queryUserName);

    public boolean deleteUserById(Integer id);
}
