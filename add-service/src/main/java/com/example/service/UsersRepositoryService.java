package com.example.service;

import com.google.common.collect.Maps;
import common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * Created by akhmelov on 7/22/16.
 */
@Service
public class UsersRepositoryService {

    @Autowired
    private RestTemplate restTemplate;

    public void addUser(User user) {
        String pongServiceUrl = "http://edit-service//test1/test3/user";
        HttpEntity<User> requestEntity = new HttpEntity<>(user);
        ResponseEntity<Void> response =  this.restTemplate.exchange(pongServiceUrl, HttpMethod.PUT, requestEntity, Void.class, Maps.newHashMap());
    }

    public void fallBackCall(User user) {
        System.out.print("Fall back call");
    }
}
