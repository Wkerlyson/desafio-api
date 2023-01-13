package com.desafio.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Region {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public String sigla;

    @OneToOne(cascade = CascadeType.PERSIST)
    public Generation geracao;


    @OneToOne(cascade = CascadeType.PERSIST)
    public Buy compra;

}
