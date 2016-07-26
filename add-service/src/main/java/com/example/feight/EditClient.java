package com.example.feight;

import common.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by akhmelov on 7/23/16.
 */
public interface EditClient {
    @RequestMapping(method = RequestMethod.PUT, value = "/user",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    void addUser(User user);
}
