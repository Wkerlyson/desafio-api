package com.desafio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Regiao {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    public String sigla;

    @OneToOne(cascade = CascadeType.PERSIST)
    public Geracao geracao;


    @OneToOne(cascade = CascadeType.PERSIST)
    public Compra compra;

    public Geracao getGeracao() {
        return geracao;
    }

    public void setGeracao(Geracao geracao) {
        this.geracao = geracao;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
