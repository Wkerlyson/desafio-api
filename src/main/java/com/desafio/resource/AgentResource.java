package com.desafio.resource;

import com.desafio.entity.Agentes;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class AgentResource {

    @PostMapping(path = "agentes")
    public void upload(@RequestParam MultipartFile file) throws IOException {
        String content = new String(file.getBytes(), StandardCharsets.UTF_8);

        XmlMapper xmlMapper = new XmlMapper();
        Agentes value
                = xmlMapper.readValue(file.getBytes(), Agentes.class);
    }
}
