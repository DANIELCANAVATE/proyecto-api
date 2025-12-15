package com.miproyecto.tiendaderopa.controller;

import com.example.proyectoAPI.model.Cliente;
import com.example.proyectoAPI.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/clientes") // Endpoint: http://localhost:8080/api/clientes
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.findAllClientes();
    }

    @GetMapping("/{id}")
public Cliente getClienteById(@PathVariable Long id) {
    return clienteService.findClienteById(id);
}


@PostMapping
public Cliente createCliente(@RequestBody Cliente cliente) {
    return clienteService.saveCliente(cliente);
}


@PutMapping("/{id}")
public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
    return clienteService.updateCliente(id, cliente);
}

@DeleteMapping("/{id}")
public void deleteCliente(@PathVariable Long id) {
    clienteService.deleteCliente(id);
}

}