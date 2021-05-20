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

    //根据id删除用户
    public boolean deleteUserById(Integer id);

    //根据id查找用户
    public User getUserById(Integer id);

    //修改用户
    public boolean editUser(User user);
}
