package com.desafio.service.impl;

import com.desafio.dto.AgentDTO;
import com.desafio.dto.RegionDTO;
import com.desafio.entity.Agent;
import com.desafio.entity.Region;
import com.desafio.repository.AgentRepository;
import com.desafio.repository.RegionRepository;
import com.desafio.service.AgentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentRepository agentRepository;
    @Autowired
    private RegionRepository regionRepository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<Agent> save(List<AgentDTO> agentsDTO) {

        List<Agent> agents = agentsDTO
                .stream()
                .map(user -> mapper.map(user, Agent.class))
                .collect(Collectors.toList());

        return this.agentRepository.saveAll(agents);
    }

    @Override
    public List<RegionDTO> findDataByRegion(String acronym) {

        List<Region> regionList = regionRepository.findBySigla(acronym);
        List<RegionDTO> regionDTOList = mapper.map(regionList, List.class);

        return regionDTOList;
    }
}
