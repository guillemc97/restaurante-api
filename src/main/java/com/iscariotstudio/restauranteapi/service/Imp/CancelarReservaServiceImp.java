package com.iscariotstudio.restauranteapi.service.Imp;

import com.iscariotstudio.restauranteapi.exception.InternalServerErrorException;
import com.iscariotstudio.restauranteapi.exception.MainException;
import com.iscariotstudio.restauranteapi.exception.NotFountException;
import com.iscariotstudio.restauranteapi.repository.ReservaRepository;
import com.iscariotstudio.restauranteapi.service.CancelarReservaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CancelarReservaServiceImp implements CancelarReservaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CancelarReservaServiceImp.class);

    @Autowired
    private ReservaRepository reservaRepository;

    public String cancelarReserva(String localicacion) throws MainException {
        reservaRepository.findByLocalicacion(localicacion).orElseThrow(() -> new NotFountException("RESERVA_NOT_FOUND", "RESERVA_NOT_FOUND"));

        try {
            reservaRepository.deleteByLocalicacion(localicacion);
        } catch (Exception e){
            LOGGER.error("INTERNAL_SERVER_ERROR", e);
            throw new InternalServerErrorException("INTERNAL_SERVER_ERROR", "INTERNAL_SERVER_ERROR");
        }

        return "Localicacion cancelada";
    }
}
