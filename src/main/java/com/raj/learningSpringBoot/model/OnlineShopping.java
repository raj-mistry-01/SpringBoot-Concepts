package com.raj.learningSpringBoot.model;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("OnlineShopping")
@Lazy
public class OnlineShopping implements Shopping{
    public OnlineShopping(){
        System.out.println("Initilizing Online shopping.");
    }
}
