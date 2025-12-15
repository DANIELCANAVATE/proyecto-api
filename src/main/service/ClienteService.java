package com.miproyecto.tiendaderopa.service;

import com.example.proyectoAPI.model.Cliente;
import com.example.proyectoAPI.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAllClientes() {
        // Lógica de negocio (por ahora, solo llama a la base de datos)
        return clienteRepository.findAll();
    }


    public Cliente findClienteById(Long id) {
    return clienteRepository.findById(id).orElse(null);
}


public Cliente saveCliente(Cliente cliente) {
    return clienteRepository.save(cliente);
}


public Cliente updateCliente(Long id, Cliente nuevo) {
    Cliente existente = clienteRepository.findById(id).orElse(null);

    if (existente != null) {
        existente.setNombre(nuevo.getNombre());
        return clienteRepository.save(existente);
    }

    return null;
}

public void deleteCliente(Long id) {
    clienteRepository.deleteById(id);
}

}