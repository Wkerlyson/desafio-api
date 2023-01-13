package com.desafio.resource;

import com.desafio.dto.AgentsDTO;
import com.desafio.dto.RegionDTO;
import com.desafio.service.AgentService;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/v1/agent")
public class AgentResource {

    @Autowired
    private AgentService service;

    @PostMapping
    public ResponseEntity save(@RequestParam MultipartFile file) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        AgentsDTO agentsDTO = xmlMapper.readValue(file.getBytes(), AgentsDTO.class);

        service.save(agentsDTO.getAgente());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/data-by-region/{acronym}")
    public ResponseEntity<List<RegionDTO>> listDataByRegion(@PathVariable String acronym){
        List<RegionDTO> list = service.findDataByRegion(acronym);
        return ResponseEntity.ok().body(list);
    }
}
