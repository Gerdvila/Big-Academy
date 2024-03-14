package com.example.rest.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No person was found")
public class NoPersonFoundException extends RuntimeException{
    public NoPersonFoundException(String message) {
        super(message);
    }
}
