package com.iscariotstudio.restauranteapi.repository;

import com.iscariotstudio.restauranteapi.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

    @Modifying
    @Transactional
    Optional<Reserva> deleteByLocalicacion(String localicacion);
}
