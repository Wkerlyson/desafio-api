package com.desafio.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "precoMedio")
@Getter
@Setter
public class PrecoMedioDTO {
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Double> valor;
}
