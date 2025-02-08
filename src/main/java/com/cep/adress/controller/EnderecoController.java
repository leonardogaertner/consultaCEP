package com.cep.adress.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.cep.adress.model.Endereco;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {

    @GetMapping
    public Endereco buscarEndereco(@RequestParam String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Endereco.class);
    }
}
