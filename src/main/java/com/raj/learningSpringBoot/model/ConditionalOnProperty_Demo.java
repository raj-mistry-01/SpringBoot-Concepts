package com.raj.learningSpringBoot.model;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component

// in app.properties
/*
prefix.value = havingValue

        */

@ConditionalOnProperty(
        prefix = "sqlConn",
        value = "enabled",
        havingValue = "yes",
        matchIfMissing = false
)
public class ConditionalOnProperty_Demo {
    ConditionalOnProperty_Demo(){
        System.out.println("Initilizing the sql db con.");
    }
}
