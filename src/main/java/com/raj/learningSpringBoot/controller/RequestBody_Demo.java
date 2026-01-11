package com.raj.learningSpringBoot.controller;

import com.raj.learningSpringBoot.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class RequestBody_Demo {

    @PostMapping(path = "/reqBodyDemo")
    public String getUserDetails(@RequestBody User user){
        return "Data recieved : " + user.username + " " + user.email;
    }
}
