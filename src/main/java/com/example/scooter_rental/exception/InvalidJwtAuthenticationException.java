package com.example.scooter_rental.exception;

public class InvalidJwtAuthenticationException extends RuntimeException {
    public InvalidJwtAuthenticationException(String message, Throwable e) {
        super(message, e);
    }
}

