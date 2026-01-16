package com.raj.learningSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class Async_Caller {
    @Autowired
    Async_Demo ademoobj;
    // do not java obj , use spring created obj otherwise async will not work
    @GetMapping(path = "/callasyncemethod")
    public void callmethod(){
        System.out.println("caller thread is : " + Thread.currentThread().getName());
        ademoobj.runasyncmethod();
        System.out.println("After async method call thread : " + Thread.currentThread().getName());
    }

}
