package com.raj.learningSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/custominterceptDemo/")
public class CustomInterceptorController {
    @GetMapping(path = "/getData")
    public String getData(){
        System.out.println("inside the controller body"); // see the output order controller + interceptor
        return "dummyData";
    }
}
