package com.ecommerce.ecommerce.exception;

public class InvalidEmailException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Invalid Email ";
    }
}