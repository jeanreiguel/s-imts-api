package com.projetoWEG.api.controller;

import com.projetoWEG.api.model.dto.aprovacao.AprovacaoApontamentoDTO;
import com.projetoWEG.domain.service.ApontamentosService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
    public List<AprovacaoApontamentoDTO> listarApontamentosId(Long id) {
    return apontamentosService.listarApontamentosConsultor(id);
    }
}
