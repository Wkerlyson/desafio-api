package com.desafio.service;

import com.desafio.entity.Agente;
import com.desafio.entity.Regiao;

import java.util.List;

public interface AgenteService {
    List<Agente> salvar(List<Agente> agente);

    List<Regiao> buscarDadosPorRegiao(String sigla);
}
