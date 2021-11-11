package com.iscariotstudio.restauranteapi.service;

import com.iscariotstudio.restauranteapi.exception.MainException;
import com.iscariotstudio.restauranteapi.json.CrearReservaRest;
import com.iscariotstudio.restauranteapi.json.ReservaRest;

public interface ReservaService {

    ReservaRest getReserva(Long restauranteId) throws MainException;

    String crearReserva(CrearReservaRest crearReservaRest) throws  MainException;
}
