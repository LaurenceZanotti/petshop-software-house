package com.softwarehouse.petshop_agendamento.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {

    private @Id @GeneratedValue Long id;
    private String nome;
    private String telefone;
    private String email;
    private int idade;
    private ArrayList<String> animais;

    Cliente() {}

    Cliente(String nome, String telefone, String email, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
    }
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<String> getAnimais() {
        return this.animais;
    }

    public void setAnimais(ArrayList<String> animais) {
        this.animais = animais;
    }
    
    
}