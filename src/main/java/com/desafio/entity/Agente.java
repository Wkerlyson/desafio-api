package com.desafio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement
@Entity
public class Agente {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    private int codigo;
    private Date data;

    @JacksonXmlElementWrapper(useWrapping = false)
    @OneToMany(cascade = CascadeType.PERSIST)
    public List<Regiao> regiao;

    public Integer getCodigo() {
        return codigo;
    }
    @XmlElement
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    @XmlElement
    public void setData(Date data) {
        this.data = data;
    }

    public List<Regiao> getRegiao() {
        return regiao;
    }

    public void setRegiao(List<Regiao> regiao) {
        this.regiao = regiao;
    }
}
