package com.raj.learningSpringBoot.exceptions;

import org.springframework.http.HttpStatus;

public class IllegalArgumentException extends RuntimeException{
    HttpStatus status;
    String message;

    public  IllegalArgumentException(HttpStatus status, String message){
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
