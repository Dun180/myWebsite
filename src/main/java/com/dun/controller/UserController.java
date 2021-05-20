package com.dun.controller;

import com.dun.pojo.User;
import com.dun.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
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

    @GetMapping("/userEditPage/{id}")
    public String userEditPage(@PathVariable("id") Integer id,Model model){
        model.addAttribute("userId",id);
        return "user/member-edit";
    }

    @RequestMapping(value = "/userEdit/{id}",method = RequestMethod.GET)
    @ResponseBody
    public void userEdit(@PathVariable("id") Integer id,
                           @RequestParam("email") String email,
                           @RequestParam("name") String name,
                           @RequestParam("password") String password
                           ){
        System.out.println(id+email+name+password);
        System.out.println("进入userEdit请求");
        User user = userService.getUserById(id);
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);
        user.setUpdateTime(new Date());
        userService.editUser(user);
    }
}
