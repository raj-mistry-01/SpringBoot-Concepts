package com.raj.learningSpringBoot.middleware;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyCustomInterceptor_Annotation {

    @Around("@annotation(com.raj.learningSpringBoot.annotations.CustomAnnotationForInterceptor)")
    public String invoke(ProceedingJoinPoint jointPoint) throws Throwable{
        System.out.println("inside custom annotation starting body");

        Object result = jointPoint.proceed(); // go to your controller body

        System.out.println("after controller inside custom annotation body");

        return result.toString();
    }
}
