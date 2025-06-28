package com.ecommerce.ecommerce.exception;

public class InvalidDetailsException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Credential does not meet the critiria";
    }
}
