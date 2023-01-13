package com.desafio.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Agent {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private int codigo;
    private Date data;

    @OneToMany(cascade = CascadeType.PERSIST)
    public List<Region> region;
}
