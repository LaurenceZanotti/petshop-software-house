package com.softwarehouse.petshop_agendamento.controllers;

import java.util.List;

import com.softwarehouse.petshop_agendamento.models.Animal;
import com.softwarehouse.petshop_agendamento.repositories.AnimalRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AnimalController {
    private final AnimalRepository repository;


    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }

    // aggroot boiler
    @GetMapping("/animais")
    List<Animal> all() {
        return repository.findAll();
    }

    @PostMapping("/animais")
    Animal novoAnimal(@RequestBody Animal novoAnimal) {
        return repository.save(novoAnimal);
    }
}