package com.miproyecto.tiendaderopa.repository;

import com.example.proyectoAPI.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Hereda findAll(), findById(), save(), etc.
}