package com.dun.controller;

import com.dun.pojo.User;
import com.dun.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    //注入userService
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/userList")
    public String getUserList(Model model){
        List<User> userList = userService.getUserList("");
        model.addAttribute("users",userList);
        System.out.println("进入userList请求");
        return "user/member-list";
    }

    @GetMapping("/delUser/{id}")
    public String delUser(@PathVariable("id") Integer id){
        userService.deleteUserById(id);
        return "redirect:/userList";
    }
}
