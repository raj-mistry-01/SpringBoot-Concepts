package com.raj.learningSpringBoot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST , reason = "Memory limit exceed")
public class MemoryIssue extends Exception{
    HttpStatus status;

    public MemoryIssue(HttpStatus status ,  String message){
        super(message);
        this.status = status;
    }
}
