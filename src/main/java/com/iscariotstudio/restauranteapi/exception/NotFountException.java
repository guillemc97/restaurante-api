package com.iscariotstudio.restauranteapi.exception;

import com.iscariotstudio.restauranteapi.dto.ErrorDto;
import org.springframework.http.HttpStatus;

import java.util.Arrays;

public class NotFountException extends MainException{

    private static final long serialVersionUID = 1L;

    public NotFountException(String message, String code) {
        super(message, code, HttpStatus.NOT_FOUND.value());
    }

    public NotFountException(String message, String code, ErrorDto errorDtos) {
        super(message, code, HttpStatus.NOT_FOUND.value(), Arrays.asList(errorDtos));
    }
}
