package com.raj.learningSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component // tells IOC to create bean of it
public class User {

    @JsonProperty("user_name")
    public String username;

    @JsonProperty("email")
    public String email;

    // adding a dependancy for some logic

    @Autowired
    Order order;

    @PostConstruct
    public void postInitilization(){
        System.out.println("post initilizing..");
    }

    public User(){
        System.out.println("Intializing user.");
    }

    @PreDestroy
    // we use predestroy to
    // when we know that bean is going destroy and we want to do something

    public void destroyNotify(){
        System.out.println("Bean is about to destroy.");
    }

}
