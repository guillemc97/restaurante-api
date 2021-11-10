package com.iscariotstudio.restauranteapi.service.Imp;

import com.iscariotstudio.restauranteapi.entity.Restaurante;
import com.iscariotstudio.restauranteapi.exception.MainException;
import com.iscariotstudio.restauranteapi.exception.NotFountException;
import com.iscariotstudio.restauranteapi.json.RestauranteRest;
import com.iscariotstudio.restauranteapi.repository.RestauranteRepository;
import com.iscariotstudio.restauranteapi.service.RestauranteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class RestauranteServiceImp implements RestauranteService {

    @Autowired
    RestauranteRepository restauranteRepository;

    public static final ModelMapper modelMapper = new ModelMapper();

    public RestauranteRest getRestauranteById(Long id) throws MainException {
        return modelMapper.map(getRestauranteEntity(id), RestauranteRest.class);
    }

    private Restaurante getRestauranteEntity(Long id) throws MainException {
        return restauranteRepository.findById(id)
                .orElseThrow(() -> new NotFountException("RESTAURANT_NOT_FOUND", "SNOT-404-1"));
    }
}
