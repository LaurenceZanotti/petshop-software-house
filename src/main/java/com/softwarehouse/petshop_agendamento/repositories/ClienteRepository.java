package com.softwarehouse.petshop_agendamento.repositories;

import com.softwarehouse.petshop_agendamento.models.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}