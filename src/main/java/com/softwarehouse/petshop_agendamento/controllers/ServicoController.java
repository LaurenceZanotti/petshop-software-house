package com.softwarehouse.petshop_agendamento.controllers;

import java.util.List;

import com.softwarehouse.petshop_agendamento.models.Servico;
import com.softwarehouse.petshop_agendamento.repositories.ServicoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicoController {
    private final ServicoRepository repository;


    public ServicoController(ServicoRepository repository) {
        this.repository = repository;
    }

    // aggroot boiler
    @GetMapping("/servicos")
    List<Servico> all() {
        return repository.findAll();
    }

    @PostMapping("/servicos")
    Servico novoServico(@RequestBody Servico novoServico) {
        return repository.save(novoServico);
    }

}