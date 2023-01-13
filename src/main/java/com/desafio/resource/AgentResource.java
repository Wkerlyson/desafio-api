package com.desafio.resource;

import com.desafio.dto.AgentesDTO;
import com.desafio.dto.RegiaoDTO;
import com.desafio.service.AgenteService;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/v1/agente")
public class AgentResource {

    @Autowired
    private AgenteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity salvar(@RequestParam MultipartFile file) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        AgentesDTO agentesDTO = xmlMapper.readValue(file.getBytes(), AgentesDTO.class);

        service.salvar(agentesDTO.getAgente());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/dados-por-regiao/{sigla}")
    public ResponseEntity<List<RegiaoDTO>> listarDadosPorRegiao(@PathVariable String sigla){
        List<RegiaoDTO> list = service.buscarDadosPorRegiao(sigla);
        return ResponseEntity.ok().body(list);
    }
}
