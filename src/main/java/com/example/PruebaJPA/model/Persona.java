package com.example.PruebaJPA.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nombre;
    private String apellido;
    private int edad;

    @OneToOne
    private Mascota unaMascota;

    public Persona() {
    }

    public Persona(long id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
