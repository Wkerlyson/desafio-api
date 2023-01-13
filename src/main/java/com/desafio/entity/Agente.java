package com.desafio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Agente {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    private int codigo;
    private Date data;

    @OneToMany(cascade = CascadeType.PERSIST)
    public List<Regiao> regiao;
}
