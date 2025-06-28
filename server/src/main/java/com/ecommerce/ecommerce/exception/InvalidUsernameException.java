package com.ecommerce.ecommerce.exception;

public class InvalidUsernameException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Invalid Username";
    }
}