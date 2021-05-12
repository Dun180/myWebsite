package com.dun.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


//扫描mapper文件夹
@MapperScan("com.dun.mapper")
@Configuration //配置类
public class MyBatisPlusConfig {
}
