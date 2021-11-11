package com.iscariotstudio.restauranteapi.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservaRest {

    @JsonProperty("localicacion")
    private String localicacion;

    @JsonProperty("persona")
    private int persona;

    @JsonProperty("fecha")
    private Date fecha;

    @JsonProperty("turno")
    private String turno;

    @JsonProperty("restaranteId")
    private Long restauranteId;

    public String getLocalicacion() {
        return localicacion;
    }

    public void setLocalicacion(String localicacion) {
        this.localicacion = localicacion;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Long getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(Long restauranteId) {
        this.restauranteId = restauranteId;
    }
}
