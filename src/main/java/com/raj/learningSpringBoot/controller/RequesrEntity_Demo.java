package com.raj.learningSpringBoot.controller;

import com.raj.learningSpringBoot.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class RequesrEntity_Demo {
    @PostMapping(path = "/respEntityDemo")
    public ResponseEntity getUserDetails(@RequestBody User user){
        String output = "Data recieved : " + user.username + " " + user.email;
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
}
