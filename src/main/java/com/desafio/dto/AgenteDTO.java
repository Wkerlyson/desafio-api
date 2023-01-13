package com.desafio.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "agente")
public class AgenteDTO {
    @XmlElement
    private int codigo;
    @XmlElement
    private Date data;

    @JacksonXmlElementWrapper(useWrapping = false)
    public List<RegiaoDTO> regiao;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }


    public void setData(Date data) {
        this.data = data;
    }

    public List<RegiaoDTO> getRegiao() {
        return regiao;
    }

    public void setRegiao(List<RegiaoDTO> regiao) {
        this.regiao = regiao;
    }
}
