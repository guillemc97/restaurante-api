package com.iscariotstudio.restauranteapi.exception;

import com.iscariotstudio.restauranteapi.dto.ErrorDto;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

public class InternalServerErrorException extends MainException{

    private static final long serialVersionUID = 1L;

    public InternalServerErrorException(String message, String code) {
        super(message, code, HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

    public InternalServerErrorException(String message, String code, ErrorDto errorDtos) {
        super(message, code, HttpStatus.INTERNAL_SERVER_ERROR.value(), Arrays.asList(errorDtos));
    }
}
