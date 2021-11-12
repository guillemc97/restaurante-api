package com.iscariotstudio.restauranteapi.service;

import com.iscariotstudio.restauranteapi.exception.MainException;

public interface CancelarReservaService {

    public String cancelarReserva(String localicacion) throws MainException;
}
