package com.raj.learningSpringBoot.exceptions;

import org.springframework.http.HttpStatus;


public class IOcall extends RuntimeException{
    HttpStatus status;
    String message;

    public  IOcall(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus(){
        return status;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
