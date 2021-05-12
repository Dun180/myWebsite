package com.dun;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dun.mapper.UserMapper;
import com.dun.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WebsiteApplicationTests {

    //继承了BaseMapper 所有方法都来自父类
    //也可以自己编写扩展方法
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        //参数是一个wrapper，条件构造器 这里先不用，传入null
        //查询全部用户
        User user = null;
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .eq("username","111")
                .eq("password","123456");
        user = userMapper.selectOne(wrapper);
        System.out.println(user);
    }

}
