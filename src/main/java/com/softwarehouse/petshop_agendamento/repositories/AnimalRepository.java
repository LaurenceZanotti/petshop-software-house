package com.softwarehouse.petshop_agendamento.repositories;

import com.softwarehouse.petshop_agendamento.models.Animal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    
}