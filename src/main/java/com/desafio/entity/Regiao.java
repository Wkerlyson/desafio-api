package com.desafio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Regiao {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    public String sigla;

    @OneToOne(cascade = CascadeType.PERSIST)
    public Geracao geracao;


    @OneToOne(cascade = CascadeType.PERSIST)
    public Compra compra;

}
