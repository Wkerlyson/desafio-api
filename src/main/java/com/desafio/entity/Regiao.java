package com.desafio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Regiao {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @XmlElement
    public String sigla;

    @XmlElement
    @OneToOne(cascade = CascadeType.PERSIST)
    public Geracao geracao;

    @XmlElement
    @OneToOne(cascade = CascadeType.PERSIST)
    public Compra compra;

    @XmlElement
    @OneToOne(cascade = CascadeType.PERSIST)
    public PrecoMedio precoMedio;

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

    public PrecoMedio getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(PrecoMedio precoMedio) {
        this.precoMedio = precoMedio;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
