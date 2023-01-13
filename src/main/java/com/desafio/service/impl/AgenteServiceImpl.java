package com.desafio.service.impl;

import com.desafio.dto.AgenteDTO;
import com.desafio.dto.RegiaoDTO;
import com.desafio.entity.Agente;
import com.desafio.entity.Regiao;
import com.desafio.repository.AgenteRepository;
import com.desafio.repository.RegiaoRepository;
import com.desafio.service.AgenteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgenteServiceImpl implements AgenteService {

    @Autowired
    private AgenteRepository agenteRepository;
    @Autowired
    private RegiaoRepository regiaoRepository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<Agente> salvar(List<AgenteDTO> agentesDTO) {

        List<Agente> agentes = agentesDTO
                .stream()
                .map(user -> mapper.map(user, Agente.class))
                .collect(Collectors.toList());

        agentesDTO.stream().forEach(c -> System.out.println("Agente.codigo:" + c.getCodigo()));

        return this.agenteRepository.saveAll(agentes);
    }

    @Override
    public List<RegiaoDTO> buscarDadosPorRegiao(String sigla) {

        List<Regiao> regiaoList = regiaoRepository.findBySigla(sigla);
        List<RegiaoDTO> regiaoDTOList = mapper.map(regiaoList, List.class);

        return regiaoDTOList;
    }
}
