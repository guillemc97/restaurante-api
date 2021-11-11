package com.iscariotstudio.restauranteapi.service.Imp;

import com.iscariotstudio.restauranteapi.entity.Reserva;
import com.iscariotstudio.restauranteapi.entity.Restaurante;
import com.iscariotstudio.restauranteapi.entity.Turno;
import com.iscariotstudio.restauranteapi.exception.InternalServerErrorException;
import com.iscariotstudio.restauranteapi.exception.MainException;
import com.iscariotstudio.restauranteapi.exception.NotFountException;
import com.iscariotstudio.restauranteapi.json.CrearReservaRest;
import com.iscariotstudio.restauranteapi.json.ReservaRest;
import com.iscariotstudio.restauranteapi.repository.ReservaRepository;
import com.iscariotstudio.restauranteapi.repository.RestauranteRepository;
import com.iscariotstudio.restauranteapi.repository.TurnoRepository;
import com.iscariotstudio.restauranteapi.service.ReservaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class ReservaServiceImp implements ReservaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReservaServiceImp.class);

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private TurnoRepository turnoRepository;

    @Autowired
    private ReservaRepository reservaRepository;

    public ReservaRest getReserva(Long restauranteId) throws MainException {
        return null;
    }


    public String crearReserva(CrearReservaRest crearReservaRest) throws MainException {
        final Reserva reserva = new Reserva();

        final Restaurante restaurante = restauranteRepository.findById(crearReservaRest.getRestauranteId()).orElseThrow(() -> new NotFountException("RESTAURANT_NOT_FOUND", "RESTAURANT_NOT_FOUND"));
        String localicacion = generarLocalicacion(restaurante, crearReservaRest);

        reserva.setLocalicacion(localicacion);
        reserva.setPersona(crearReservaRest.getPersona());
        reserva.setFecha(crearReservaRest.getFecha());
        reserva.setRestaurante(restaurante);

        final Turno turno = turnoRepository.findById(crearReservaRest.getTurno()).orElseThrow(() -> new NotFountException("TURNO_NOT_FOUND", "TURNO_NOT_FOUND"));
        reserva.setTurno(turno.getNombre());

        try {
            reservaRepository.save(reserva);
        } catch (final Exception e){
            LOGGER.error("INTERNAL_SERVER_ERROR", e);
            throw new InternalServerErrorException("INTERNAL_SERVER_ERROR", "INTERNAL_SERVER_ERROR");
        }

        return null;
    }

    private String generarLocalicacion(final Restaurante restaurante, final  CrearReservaRest crearReservaRest) throws MainException {
        return restaurante.getNombre() + crearReservaRest.getTurno();
    }
}
