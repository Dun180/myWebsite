package com.dun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    //视图跳转配置
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/backstage.html").setViewName("backstage");
        registry.addViewController("/register.html").setViewName("register");
        //registry.addViewController("/member-list.html").setViewName("/user/member-list");
        registry.addViewController("/member-del.html").setViewName("/user/member-del");
    }

    //拦截器配置
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandlerInterceptor()).
//                //addPathPatterns("/**").excludePathPatterns("index.html","/login.html","/register.html","/","/user/**","/css/**","/js/**","/img/**","/fonts/**","/lib/**");
//                addPathPatterns("/backstage.html");
//    }
}
