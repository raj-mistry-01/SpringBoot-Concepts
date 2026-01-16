package com.raj.learningSpringBoot.controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Before_Demo {
    @Before("execution(* com.raj.learningSpringBoot.controller.SampleController.getUserDetails())")
    public void beforeSampleDatagetting(){
        System.out.println("Yes done some work before sending api data.");
    }
}
