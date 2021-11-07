package com.iscariotstudio.restauranteapi.exception;

import com.iscariotstudio.restauranteapi.dto.ErrorDto;

import java.util.ArrayList;
import java.util.List;

public class MainException extends Exception{

    private static final long serialVersionUID = 1L;

    private final String code;
    private final int reponseCode;
    private final List<ErrorDto> errorDtos = new ArrayList<>();

    public MainException(String message, String code, int reponseCode) {
        super(message);
        this.code = code;
        this.reponseCode = reponseCode;
    }

    public MainException(String message, String code, int reponseCode, List<ErrorDto> errorDtos) {
        super(message);
        this.code = code;
        this.reponseCode = reponseCode;
        this.errorDtos.addAll(errorDtos);
    }

    public String getCode() {
        return code;
    }

    public int getReponseCode() {
        return reponseCode;
    }

    public List<ErrorDto> getErrorDtos() {
        return errorDtos;
    }


}
