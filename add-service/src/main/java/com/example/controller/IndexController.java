package com.example.controller;

import com.example.service.UsersRepositoryService;
import common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by akhmelov on 7/20/16.
 */
@Controller
public class IndexController {

    @Autowired
    private UsersRepositoryService usersRepositoryService;

    @Value("${reply.message}")
    private String message;

    @RequestMapping("/index/test1")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @ResponseBody
    public boolean putUser(@RequestBody User user){
        usersRepositoryService.addUser(user);
        return true;
    }
}
