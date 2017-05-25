package com.eccom.demo.user.controller;

import com.eccom.demo.user.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by zyn on 5/18/17.
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8707/" + id, User.class);
    }
    @GetMapping("/instances/{name}")
    public List<ServiceInstance> getInstanceList(@PathVariable String name) {
       List<ServiceInstance> instances = discoveryClient.getInstances(name);
       return instances;
    }
}
