package com.desafio.repository;

import com.desafio.entity.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long> {
    List<Regiao> findBySigla(String sigla);
}