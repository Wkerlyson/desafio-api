package com.desafio.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "regiao")
public class RegiaoDTO {

    @XmlElement
    public String sigla;

    @XmlElement
    public GeracaoDTO geracao;

    @XmlElement
    public CompraDTO compra;

    @XmlElement
    public PrecoMedioDTO precoMedio;

    public GeracaoDTO getGeracao() {
        return geracao;
    }

    public void setGeracao(GeracaoDTO geracao) {
        this.geracao = geracao;
    }

    public CompraDTO getCompra() {
        return compra;
    }

    public void setCompra(CompraDTO compra) {
        this.compra = compra;
    }

    public PrecoMedioDTO getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(PrecoMedioDTO precoMedio) {
        this.precoMedio = precoMedio;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
