package com.dun.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dun.pojo.User;
import org.springframework.stereotype.Repository;

@Repository //代表持久层
public interface UserMapper extends BaseMapper<User> {//在对应的Mapper上继承基本的类 BaseMapper
}
