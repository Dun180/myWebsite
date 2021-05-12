package com.dun.service.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dun.mapper.UserMapper;
import com.dun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    //继承了BaseMapper 所有方法都来自父类
    //也可以自己编写扩展方法
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        User user = null;
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .eq("username",username)
                .eq("password",password);
        user = userMapper.selectOne(wrapper);
        System.out.println(user);
        return user;
    }

    @Override
    public void test() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
