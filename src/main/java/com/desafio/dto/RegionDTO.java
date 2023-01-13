package com.desafio.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "regiao")
@Getter
@Setter
public class RegionDTO {

    @XmlElement
    public String sigla;

    @XmlElement
    public GenerationDTO geracao;

    @XmlElement
    public BuyDTO compra;

    @XmlElement
    public AveragePriceDTO precoMedio;
}
