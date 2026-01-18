package com.raj.learningSpringBoot.controller;

import com.raj.learningSpringBoot.model.User;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/")
public class RequestEntity_Demo {
    @PostMapping(path = "/respEntityDemo")
    public ResponseEntity getUserDetails(@RequestBody User user){
        String output = "Data recieved : " + user.username + " " + user.email;
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
}

