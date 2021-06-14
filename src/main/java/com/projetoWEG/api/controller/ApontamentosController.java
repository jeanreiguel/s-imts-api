package com.projetoWEG.api.controller;

import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.service.ApontamentosService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/apontamentos")
public class ApontamentosController {

    private ApontamentosService apontamentosService;

    @PostMapping("inserir")
    @ResponseStatus(HttpStatus.CREATED)
    public Apontamento inserirApontamento(@Valid @RequestBody Apontamento apontamento) {
        return apontamentosService.inserir(apontamento);
    }
    @GetMapping
    public List<Apontamento> listarApontamentos() {
        return apontamentosService.listarTodos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Apontamento> listarApontamentosId(Long id) {
    return apontamentosService.listarApontamentosConsultor(id);
    }
}
