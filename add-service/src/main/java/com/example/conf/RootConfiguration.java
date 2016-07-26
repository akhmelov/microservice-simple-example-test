package com.example.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * Created by akhmelov on 7/24/16.
 */
@Configuration
public class RootConfiguration {

    @Bean
    public RestOperations nonLoadbalancedRestTemplate() {
        return new RestTemplate();
    }

}
