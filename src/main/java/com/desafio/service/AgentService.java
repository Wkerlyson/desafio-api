package com.desafio.service;

import com.desafio.dto.AgentDTO;
import com.desafio.dto.RegionDTO;
import com.desafio.entity.Agent;

import java.util.List;

public interface AgentService {
    List<Agent> save(List<AgentDTO> agentList);

    List<RegionDTO> findDataByRegion(String sigla);
}
