package com.desafio.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Generation {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ElementCollection
    public List<Double> valor;
}
