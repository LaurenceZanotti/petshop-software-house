package com.softwarehouse.petshop_agendamento.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animais")
public class Animal {
    private @Id @GeneratedValue Long id;
    private String nome;
    private String raca;
    private char especie;
    private String aparencia;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;



    public Animal(String nome, String raca, char especie, String aparencia, Cliente cliente) {
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        this.aparencia = aparencia;
        this.cliente = cliente;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public char getEspecie() {
        return this.especie;
    }

    public void setEspecie(char especie) {
        this.especie = especie;
    }

    public String getAparencia() {
        return this.aparencia;
    }

    public void setAparencia(String aparencia) {
        this.aparencia = aparencia;
    }
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}