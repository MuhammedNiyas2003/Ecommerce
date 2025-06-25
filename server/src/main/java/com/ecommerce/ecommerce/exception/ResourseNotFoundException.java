package com.ecommerce.ecommerce.exception;

public class ResourseNotFoundException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Resource not found";
    }
}
