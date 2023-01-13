package com.desafio.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "agentes")
public class AgentesDTO {
    @XmlElement
    private double versao;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<AgenteDTO> agente;

    public double getVersao() {
        return versao;
    }

    public void setVersao(double versao) {
        this.versao = versao;
    }

    public List<AgenteDTO> getAgente() {
        return agente;
    }

    public void setAgente(List<AgenteDTO> agente) {
        this.agente = agente;
    }
}
