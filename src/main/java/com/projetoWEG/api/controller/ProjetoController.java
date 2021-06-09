package com.projetoWEG.api.controller;

import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.repository.ProjetoRepository;
import com.projetoWEG.domain.service.ProjetoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private ProjetoService projetoService;

    @GetMapping
    public List<Projeto> listarProjetos() {
        return projetoService.listarTodos();
    }
}
