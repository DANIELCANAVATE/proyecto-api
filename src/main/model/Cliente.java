package com.miproyecto.tiendaderopa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Cliente { // <-- Spring Boot usa "cliente" como nombre de tabla

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único de cliente

    private String nombre; // nombre del cliente

    // JPA requiere un constructor vacío (sin argumentos)
    public Cliente() {} 

    // Opcional: Constructor para crear objetos fácilmente
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters (Necesarios)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}