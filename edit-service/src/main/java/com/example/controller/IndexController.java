package com.example.controller;

import com.example.service.UserRepositoryService;
import common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by akhmelov on 7/20/16.
 */
@Controller
public class IndexController {

    @Autowired
    private UserRepositoryService userRepositoryService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUser(){
        return userRepositoryService.getUsers();
    }
}
