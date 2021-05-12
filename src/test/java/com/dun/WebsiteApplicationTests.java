package com.dun;

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
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}
