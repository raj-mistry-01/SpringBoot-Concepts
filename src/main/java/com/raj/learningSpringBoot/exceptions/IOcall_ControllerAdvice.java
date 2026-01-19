package com.raj.learningSpringBoot.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class IOcall_ControllerAdvice {

    @ExceptionHandler(IOcall.class)
    public ResponseEntity handleIoResolver(IOcall ex){
        return ResponseEntity.status(ex.getStatus()).body(ex.getMessage());
    }
}
