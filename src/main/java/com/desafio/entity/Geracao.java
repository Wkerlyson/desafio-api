package com.desafio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@Entity
public class Geracao {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @JacksonXmlElementWrapper(useWrapping = false)
    @ElementCollection
    public List<Double> valor;

    public List<Double> getValor() {
        return valor;
    }

    public void setValor(List<Double> valor) {
        this.valor = valor;
    }
}
