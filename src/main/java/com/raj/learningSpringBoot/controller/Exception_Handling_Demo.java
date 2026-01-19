package com.raj.learningSpringBoot.controller;


import com.raj.learningSpringBoot.exceptions.CustomException;
import com.raj.learningSpringBoot.exceptions.IOcall;
import com.raj.learningSpringBoot.exceptions.IllegalArgumentException;
import com.raj.learningSpringBoot.exceptions.MemoryIssue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class Exception_Handling_Demo {

    @GetMapping(path = "/getSomeException")
    public ResponseEntity<?> getUser() throws CustomException {
        throw new CustomException(HttpStatus.BAD_REQUEST , "UserId is missing");
    }

    @GetMapping(path = "/getSomeExceptionArgu")
    public ResponseEntity<?> getUser1() throws CustomException {
        throw new IllegalArgumentException(HttpStatus.FAILED_DEPENDENCY , "Args not satisfied.");
    }


    @GetMapping(path =  "/deomOfControllerAdvice")
    public ResponseEntity deomControllerAdvice() throws Exception{
        throw new IOcall(HttpStatus.SERVICE_UNAVAILABLE , "IO not received from IO devices");
    }


    @GetMapping(path = "/mle")
    public ResponseEntity demomle_reponsestatusAnnotation() throws Exception{
        throw  new MemoryIssue(HttpStatus.OK,"Working"); // this will not work because of ResponseSatus annotation on the top that class exception
    }




    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> handleCustomExceptionAndSend(CustomException
                                                           ex){
            return ResponseEntity.status(ex.getStatus()).body(ex.getMessage());
    }


    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleCustomExceptionAndSend(IllegalArgumentException
                                                                  ex){
        return ResponseEntity.status(ex.getStatus()).body(ex.getMessage());
    }



}
