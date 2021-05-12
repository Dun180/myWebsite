package com.dun.service.user;

import com.dun.pojo.User;

public interface UserService {
    //用户登录
    public User login(String username, String password);

    public void test();
}
