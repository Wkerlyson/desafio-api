package com.desafio.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Agentes {

    private double versao;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Agente> agente;

    public double getVersao() {
        return versao;
    }

    @XmlElement
    public void setVersao(double versao) {
        this.versao = versao;
    }

    public List<Agente> getAgente() {
        return agente;
    }

    public void setAgente(List<Agente> agente) {
        this.agente = agente;
    }
}
