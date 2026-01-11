package com.raj.learningSpringBoot.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("OfflineShopping")
@Lazy
public class OfflineShopping implements Shopping {
    public OfflineShopping(){
        System.out.println("Initilizing OfflineShopping");
    }
}
