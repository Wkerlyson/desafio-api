package com.desafio.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class Agente {
    private int codigo;
    private Date data;

    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Regiao> regiao;

    public int getCodigo() {
        return codigo;
    }
    @XmlElement
    public void setCodigo(int codigo) {
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
