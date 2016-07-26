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

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/message", method = RequestMethod.PUT)
    @ResponseBody
    public boolean putMessage(@RequestBody User user){
        usersRepositoryService.addUser(user);
        return true;
    }
}
