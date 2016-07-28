package com.example.controller;

import com.example.service.UserRepositoryService;
import common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by akhmelov on 7/23/16.
 */
@RestController
public class AddServiceController {

    @Autowired
    private UserRepositoryService userRepositoryService;

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public void pongMessage(@RequestBody User user) {
        userRepositoryService.addUser(user);
            System.out.print(user);
    }
}
