package com.example.SpringBoot.RestServices.Exceptions;

import io.swagger.annotations.ApiModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@ApiModel(description = "UserNotFound exception class")
public class UserNotfoundException extends RuntimeException {
    public UserNotfoundException(String message) {
        super(message);
    }
}
