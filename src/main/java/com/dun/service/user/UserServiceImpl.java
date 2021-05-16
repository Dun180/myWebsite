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
    public boolean register(User user) {
        boolean flag = false;
        int insert = userMapper.insert(user);
        System.out.println(insert+" "+user);
        if (insert > 0){
            flag = true;
            System.out.println("add success");
            user.setName("用户"+user.getId());
            int update = userMapper.updateById(user);
            System.out.println("更新状况:"+update);
        }else{
            System.out.println("add failed");
        }
        return flag;
    }

    @Override
    public List<User> getUserList(String queryUserName) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        List<User> users = userMapper.selectList(wrapper);
        return users;
    }

    @Override
    public boolean deleteUserById(Integer id) {
        boolean flag = false;
        int delete = userMapper.deleteById(id);
        if(delete>0){
            flag = true;
            System.out.println("delete success");
        }else {
            System.out.println("delete failed");
        }
        return flag;
    }
}
