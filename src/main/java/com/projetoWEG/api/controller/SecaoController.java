package com.projetoWEG.api.controller;

import com.projetoWEG.domain.model.Secao;
import com.projetoWEG.domain.repository.SecaoRepository;
import com.projetoWEG.domain.service.SecaoService;
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

    private SecaoService secaoService;

    @GetMapping
    public List<Secao> listarSecao() {
        return secaoService.listarTodos();
    }
}
