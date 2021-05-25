
package com.dun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dun.mapper")//扫描mapper文件夹
public class WebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsiteApplication.class, args);
    }

}