package com.projetoWEG.api.controller;

import com.projetoWEG.api.model.dto.aprovacao.AprovacaoApontamentoDTO;
import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.service.ApontamentosService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/apontamentos")
public class ApontamentosController {

    private ApontamentosService apontamentosService;

    @GetMapping
    public List<AprovacaoApontamentoDTO> listarApontamentos() {
        return apontamentosService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Apontamento> listarApontamentosId(Long id) {
    return apontamentosService.listarApontamento(id);
    }
}
