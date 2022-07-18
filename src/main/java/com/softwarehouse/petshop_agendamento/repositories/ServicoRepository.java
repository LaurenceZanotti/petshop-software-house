package com.softwarehouse.petshop_agendamento.repositories;

import com.softwarehouse.petshop_agendamento.models.Servico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    
}