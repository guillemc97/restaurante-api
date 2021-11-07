package com.iscariotstudio.restauranteapi.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long id;

    @Column(name = "Localicacion")
    private String localicacion;

    @Column(name = "Persona")
    private int persona;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Turno")
    private String turno;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "Restaurante_Id", nullable = false)
    private Restaurante restaurante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
