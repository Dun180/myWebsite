package com.dun.controller;

import com.dun.pojo.User;
import com.dun.service.user.UserService;
import com.dun.service.user.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    //注入userService
    @Resource(name = "userService")
    private UserService userService;

    //进入登录页面
    @RequestMapping("/user/toLogin")
    public String toLogin(){
        return "redirect:/login.html";
    }

    //登录请求
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession session){
        if(!StringUtils.isEmpty(username)&&!StringUtils.isEmpty(password)){
            User user = userService.login(username,password);
            if(user!=null){
                session.setAttribute("loginUser",user);
                return "redirect:/backstage.html";
            }else{
                model.addAttribute("msg","用户名或密码错误!");
                return "login";
            }

        }else {
            //登录失败
            model.addAttribute("msg","用户名或密码不能为空!");
            return "login";
        }
    }
}
