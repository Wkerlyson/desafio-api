package com.desafio.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "agentes")
@Getter
@Setter
public class AgentsDTO {
    @XmlElement
    private double versao;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<AgentDTO> agente;
}
