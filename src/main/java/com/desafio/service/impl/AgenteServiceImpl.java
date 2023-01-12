package com.desafio.service.impl;

import com.desafio.entity.Agente;
import com.desafio.entity.Regiao;
import com.desafio.repository.AgenteRepository;
import com.desafio.repository.RegiaoRepository;
import com.desafio.service.AgenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenteServiceImpl implements AgenteService {

    @Autowired
    private AgenteRepository agenteRepository;

    @Autowired
    private RegiaoRepository regiaoRepository;

    @Override
    public List<Agente> salvar(List<Agente> agente) {
        return this.agenteRepository.saveAll(agente);
    }

    @Override
    public List<Regiao> buscarDadosPorRegiao(String sigla) {
        return regiaoRepository.findBySigla(sigla);
    }
}
