package com.iscariotstudio.restauranteapi.repository;

import com.iscariotstudio.restauranteapi.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
    Optional<Restaurante> findById(Long id);
}
