package com.raj.learningSpringBoot.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order {
    String name;
    Integer orderId;

    public Order(){
        System.out.println("intializing the order");
    }
}
