package com.cep.adress.service;

import com.cep.adress.model.Endereco;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoService {
    
    private static final String URL_VIA_CEP = "https://viacep.com.br/ws/{cep}/json/";

    public Endereco buscarEnderecoPorCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL_VIA_CEP, Endereco.class, cep);
    }
}

