package com.example.controller;

import common.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by akhmelov on 7/20/16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/message", method = RequestMethod.PUT)
    @ResponseBody
    public boolean putMessage(@RequestBody User user){
        return true;
    }
}
