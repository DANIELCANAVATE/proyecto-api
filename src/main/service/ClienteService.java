package com.miproyecto.tiendaderopa.service;

<<<<<<< HEAD
import com.miproyecto.tiendaderopa.model.Cliente; 
import com.miproyecto.tiendaderopa.repository.ClienteRepository;
=======
import com.example.proyectoAPI.model.Cliente;
import com.example.proyectoAPI.repository.ClienteRepository;
>>>>>>> 90777319c3d9d4841d5f0437d5ac4605c5cce919
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

<<<<<<< HEAD

=======
>>>>>>> 90777319c3d9d4841d5f0437d5ac4605c5cce919
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAllClientes() {
<<<<<<< HEAD
        return clienteRepository.findAll();
    }

    public Cliente findClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null); 
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
=======
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

>>>>>>> 90777319c3d9d4841d5f0437d5ac4605c5cce919
}