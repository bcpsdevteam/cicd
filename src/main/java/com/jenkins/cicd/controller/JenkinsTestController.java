package com.jenkins.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, This is first step for jenkins cicd --1 controller call";
    }
}
