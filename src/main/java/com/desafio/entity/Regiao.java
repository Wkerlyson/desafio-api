package com.desafio.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Regiao {

    @XmlElement
    public Geracao geracao;

    @XmlElement
    public Compra compra;

    @XmlElement
    public PrecoMedio precoMedio;

    @XmlElement
    public String sigla;

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
