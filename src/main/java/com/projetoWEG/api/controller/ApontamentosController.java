package com.projetoWEG.api.controller;

import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.service.ApontamentosService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/apontamentos")
public class ApontamentosController {

    private ApontamentosService apontamentosService;

    @GetMapping("/{id}")
    public List<Apontamento> listarApontamentosId(Long id) {
    return apontamentosService.listarApontamentosConsultor(id);
    }
}
