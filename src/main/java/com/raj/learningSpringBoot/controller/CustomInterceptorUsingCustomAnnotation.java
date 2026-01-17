package com.raj.learningSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.raj.learningSpringBoot.annotations.CustomAnnotationForInterceptor;

@RestController
@RequestMapping(path = "/api/")
public class CustomInterceptorUsingCustomAnnotation {

    @GetMapping(path = "/tempdata")
    @CustomAnnotationForInterceptor(name = "raj makwana")
    public String getData(){
        System.out.println("inside the controller body.");
        return "dummyData";
    }
}
