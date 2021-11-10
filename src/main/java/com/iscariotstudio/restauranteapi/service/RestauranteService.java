package com.iscariotstudio.restauranteapi.service;


import com.iscariotstudio.restauranteapi.exception.MainException;
import com.iscariotstudio.restauranteapi.json.RestauranteRest;

public interface RestauranteService {

    RestauranteRest getRestauranteById(Long id) throws MainException;

}
