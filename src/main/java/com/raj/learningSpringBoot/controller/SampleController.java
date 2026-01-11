package com.raj.learningSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class SampleController {
    @GetMapping(path = "/fetchUser")
    public String getUserDetails() {
        return "{name : raj , id : 1}";
    }
}
