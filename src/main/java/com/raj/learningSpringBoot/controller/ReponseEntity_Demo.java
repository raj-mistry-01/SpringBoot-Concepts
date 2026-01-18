package com.raj.learningSpringBoot.controller;

import com.raj.learningSpringBoot.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class ReponseEntity_Demo {
    @GetMapping(path = "/getSomeUserData")
    public ResponseEntity getUserData(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("CSRF" , "rtvdrE534dbdy7nSDH");
        headers.add("JWT" , "SyvdjU64g54gsb&sns");
        User user = new User("raj","raj.makwana@gmail.com");
        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(user);
    }

    // 3xx
    // 301 moved permanently
    // internally called that api
    // in old api version header you have to tell the location or URI of new one.
    @GetMapping(path = "/v1/getUser")
    public ResponseEntity getUserData2(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location" , "/api/v2/getUser"); // goes to this URI
        return ResponseEntity
                .status(HttpStatus.MOVED_PERMANENTLY)
                .headers(httpHeaders)
                .build();
    }

    @GetMapping(path = "/v2/getUser")
    public ResponseEntity getUserData4(){
        User user = new User("raj","raj.makwana@gmail.com");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(user);
    }


    // 308
    // do not allow the http method to redirect

}


