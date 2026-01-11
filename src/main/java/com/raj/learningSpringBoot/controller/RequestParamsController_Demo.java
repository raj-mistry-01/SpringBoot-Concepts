package com.raj.learningSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class RequestParamsController_Demo {

    @GetMapping(path = "/getUserId")
    public String getUserDetails(
            @RequestParam (name = "id") String thisId
    ) {
        System.out.println("Id received : " + thisId);
        return "dummyData";

    }
}
