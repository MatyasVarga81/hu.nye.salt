package hu.nye.salt.controller;

import hu.nye.salt.exception.SaluteNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Salute report not found in the db.")
    @ExceptionHandler(SaluteNotFoundException.class)
    public void handleUserNotFoundException() {

    }
}
