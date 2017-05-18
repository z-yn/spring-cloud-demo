package com.eccom.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zyn on 5/18/17.
 */
@RestController
public class HelloController {
    @Value("${profile}")
    public String profile;

    @GetMapping("/profile")
    public String profile() {
        return profile;
    }
}
