package com.kja.webPrj.user.controller;

import com.kja.webPrj.user.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @RequestMapping("")
    @ResponseBody
    public String users() {
        return "유저 여러명!";
    }

    @RequestMapping("1")
    @ResponseBody
    public User user() {
        User user = new User();
        return user;
    }
    // /api/users => users() : 유저 여러명
    // /api/users/1 => user() : 유저 한명명
}
