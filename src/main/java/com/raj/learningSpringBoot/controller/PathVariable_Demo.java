package com.raj.learningSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/api/")
public class PathVariable_Demo {

    @GetMapping(path = "/fetchUser/{id}/{id1}")
    public String getSomeData(
            @PathVariable(value = "id") String id,
            @PathVariable(value = "id1") String id1
    ){
        System.out.println("Got this : " + id + " " + id1);
        return "dummyData";
    }
}
