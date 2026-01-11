package com.raj.learningSpringBoot.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Qualifier_Demo {

    @Autowired
    @Qualifier("OnlineShopping")
    Shopping onlingshoppingObj;

    @Autowired
    @Qualifier("OfflineShopping")
    Shopping offlineshoppingObj;
}
