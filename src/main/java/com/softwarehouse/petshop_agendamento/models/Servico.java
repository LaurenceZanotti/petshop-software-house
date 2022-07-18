package com.softwarehouse.petshop_agendamento.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Servico {
    
    private @Id @GeneratedValue Long id;
    private String nome;
    private String descricao;
    private String tempo;
    private double custo;


    public Servico(String nome, String descricao, String tempo, double custo) {
        this.nome = nome;
        this.descricao = descricao;
        this.tempo = tempo;
        this.custo = custo;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTempo() {
        return this.tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public double getCusto() {
        return this.custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

}