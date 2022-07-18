package com.softwarehouse.petshop_agendamento.controllers;

import java.util.List;

import com.softwarehouse.petshop_agendamento.models.Cliente;
import com.softwarehouse.petshop_agendamento.repositories.ClienteRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    private final ClienteRepository repository;
    
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }
    
    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/clientes")
    List<Cliente> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/clientes")
    Cliente novoCliente(@RequestBody Cliente novoCliente) {
        return repository.save(novoCliente);
    }

}