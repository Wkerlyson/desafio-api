package com.desafio.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "regiao")
@Getter
@Setter
public class RegiaoDTO {

    @XmlElement
    public String sigla;

    @XmlElement
    public GeracaoDTO geracao;

    @XmlElement
    public CompraDTO compra;

    @XmlElement
    public PrecoMedioDTO precoMedio;
}
