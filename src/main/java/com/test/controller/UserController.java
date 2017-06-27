package com.test.controller;

import com.test.dao.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lan on 2017/5/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "success";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "index";
    }

    @RequestMapping("/test3")
    @ResponseBody
    public List<User> test3(){
        return userService.getAllUser();
    }
}
