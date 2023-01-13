package com.desafio.service;

import com.desafio.dto.AgenteDTO;
import com.desafio.dto.RegiaoDTO;
import com.desafio.entity.Agente;

import java.util.List;

public interface AgenteService {
    List<Agente> salvar(List<AgenteDTO> agente);

    List<RegiaoDTO> buscarDadosPorRegiao(String sigla);
}
