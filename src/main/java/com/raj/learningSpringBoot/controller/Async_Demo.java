package com.raj.learningSpringBoot.controller;

import org.springframework.data.web.ProjectedPayload;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Async_Demo {

//    @Async with only Async it uses the default executor


    @Async("myThreadPoolExecutor") // telling to use from app config
    public void runasyncmethod(){
        System.out.println("This is thread : " + Thread.currentThread().getName());
    }
}
