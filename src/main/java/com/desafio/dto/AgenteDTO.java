package com.desafio.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "agente")
@Getter
@Setter
public class AgenteDTO {
    @XmlElement
    private int codigo;
    @XmlElement
    private Date data;

    @JacksonXmlElementWrapper(useWrapping = false)
    public List<RegiaoDTO> regiao;

}
