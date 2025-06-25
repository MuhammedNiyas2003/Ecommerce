package com.ecommerce.ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;

import com.ecommerce.ecommerce.response.ResponseStructure;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseStatusExceptionHandler{
    @ExceptionHandler(ResourseNotFoundException.class)
    public ResponseEntity<ResponseStructure<String>> handleResourceNotFoundException() {
        ResponseStructure<String> rs = new ResponseStructure<>();
        rs.setStatusCode(HttpStatus.NOT_FOUND.value());
        rs.setMessage("Resource not found");
        return new ResponseEntity<>(rs, HttpStatus.NOT_FOUND);
    }
}
