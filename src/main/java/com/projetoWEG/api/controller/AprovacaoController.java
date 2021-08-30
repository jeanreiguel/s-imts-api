package com.projetoWEG.api.controller;

import com.projetoWEG.api.model.dto.AprovacaoDTO;
import com.projetoWEG.api.model.input.AprovacaoInput;
import com.projetoWEG.domain.repository.ApontamentosRepository;
import com.projetoWEG.domain.service.AprovacaoApontamentoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/aprovacao")
public class AprovacaoController {

    private AprovacaoApontamentoService aprovacaoApontamentoService;
    private ApontamentosRepository apontamentosRepository;
    @GetMapping
    public List<AprovacaoDTO> listarAprovacoes() {
        return aprovacaoApontamentoService.listarAprovacoes();
    }

    @PostMapping("/inserir")
    public AprovacaoDTO inserirAprovacao(@RequestBody AprovacaoInput aprovacaoInput) {

        return aprovacaoApontamentoService.aprovarHoras(aprovacaoInput);
    }
}
