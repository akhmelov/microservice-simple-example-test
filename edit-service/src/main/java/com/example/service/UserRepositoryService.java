package com.example.service;

import common.model.User;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by akhmelov on 7/23/16.
 */
@Service
public class UserRepositoryService {
    private List<User> users;

    public UserRepositoryService() {
        users = new LinkedList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
