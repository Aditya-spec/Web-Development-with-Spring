package com.example.SpringBoot.RestServices;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserNotfoundException.class)
    public ResponseEntity<?> handleResourceNotFoundEcxception
            (UserNotfoundException exception, WebRequest request) {
        ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(),
                exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGlobalEcxception(Exception exception, WebRequest request) {
        ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(),
                exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(exceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

