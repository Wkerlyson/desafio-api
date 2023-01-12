package com.desafio.resource;

import com.desafio.entity.Agentes;
import com.desafio.entity.Regiao;
import com.desafio.service.AgenteService;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void salvar(@RequestParam MultipartFile file) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        Agentes value = xmlMapper.readValue(file.getBytes(), Agentes.class);
        value.getAgente().stream().forEach(c -> System.out.println(c.getCodigo()));

        service.salvar(value.getAgente());
    }

    @GetMapping("/dados-por-regiao/{sigla}")
    public List<Regiao> listarDadosPorRegiao(@PathVariable String sigla){
        List<Regiao> list = service.buscarDadosPorRegiao(sigla);
        return list;
    }
}
