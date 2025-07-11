package com.ecommerce.ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ecommerce.ecommerce.response.ResponseStructure;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
    @ExceptionHandler(ResourseNotFoundException.class)
    public ResponseEntity<ResponseStructure<String>> handleResourceNotFoundException() {
        ResponseStructure<String> rs = new ResponseStructure<>();
        rs.setStatusCode(HttpStatus.NOT_FOUND.value());
        rs.setMessage("Resource not found");
        return new ResponseEntity<>(rs, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidEmailException.class)
    public ResponseEntity<ResponseStructure<String>> handleInvalidEmailException() {
        ResponseStructure<String> rs = new ResponseStructure<>();
        rs.setStatusCode(HttpStatus.NOT_FOUND.value());
        rs.setMessage("Invalid Email");
        return new ResponseEntity<>(rs, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(InvalidUsernameException.class)
    public ResponseEntity<ResponseStructure<String>> handleInvalidUsernameException() {
        ResponseStructure<String> rs = new ResponseStructure<>();
        rs.setStatusCode(HttpStatus.NOT_FOUND.value());
        rs.setMessage("Invalid Email");
        return new ResponseEntity<>(rs, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(InvalidDetailsException.class)
    public ResponseEntity<ResponseStructure<String>> handleInvalidDetailsException() {
        ResponseStructure<String> rs = new ResponseStructure<>();
        rs.setStatusCode(HttpStatus.NOT_FOUND.value());
        rs.setMessage("Credential does not meet the critiria");
        return new ResponseEntity<>(rs, HttpStatus.CONFLICT);
    }


}
