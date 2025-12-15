package com.miproyecto.tiendaderopa.repository;

import com.miproyecto.tiendaderopa.model.Cliente;        // <-- CAMBIAR ESTO
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// ...

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}