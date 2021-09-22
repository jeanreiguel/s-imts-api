package com.projetoWEG.api.controller;

import com.projetoWEG.domain.model.Secao;
import com.projetoWEG.domain.repository.SecaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/secao")
public class SecaoController {

    private SecaoRepository secaoRepository;

    @GetMapping
    public List<Secao> listarSecao() {
        return secaoRepository.findAll();
    }
}
