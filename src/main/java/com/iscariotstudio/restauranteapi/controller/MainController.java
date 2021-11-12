package com.iscariotstudio.restauranteapi.controller;

import com.iscariotstudio.restauranteapi.exception.MainException;
import com.iscariotstudio.restauranteapi.json.RestauranteRest;
import com.iscariotstudio.restauranteapi.responses.RestauranteResponse;
import com.iscariotstudio.restauranteapi.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/restauranteApi" + "v1")
public class MainController {

     @Autowired
    RestauranteService restauranteService;

     public RestauranteResponse<RestauranteRest> getRestauranteById(Long id) throws MainException {
         return new RestauranteResponse<>("Succes", String.valueOf(HttpStatus.OK), "OK",
                 restauranteService.getRestauranteById(id));
     }
}
