package com.projetoWEG.api.controller;

import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.service.ApontamentosService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/apontamentos")
public class ApontamentosController {

    private ApontamentosService apontamentosService;

    @GetMapping
    public List<Apontamento> listarApontamentos() {
        return apontamentosService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Apontamento> listarApontamentosId(Long id) {
    return apontamentosService.listarApontamentosConsultor(id);
    }
}
