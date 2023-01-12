package com.desafio.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Geracao {

    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Double> valor;

    public List<Double> getValor() {
        return valor;
    }

    public void setValor(List<Double> valor) {
        this.valor = valor;
    }
}
