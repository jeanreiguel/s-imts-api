package com.projetoWEG.api.controller;

import com.projetoWEG.api.model.dto.aprovacao.AprovacaoDTO;
import com.projetoWEG.api.model.input.AprovacaoInputDTO;
import com.projetoWEG.domain.repository.ApontamentosRepository;
import com.projetoWEG.domain.service.AprovacaoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/aprovacao")
public class AprovacaoController {

    private AprovacaoService aprovacaoApontamentoService;
    private ApontamentosRepository apontamentosRepository;
    @GetMapping
    public List<AprovacaoDTO> listarAprovacoes() {
        return aprovacaoApontamentoService.listarAprovacoes();
    }

    @PostMapping("/inserir")
    public AprovacaoDTO inserirAprovacao(@RequestBody AprovacaoInputDTO aprovacaoInput) {

        return aprovacaoApontamentoService.aprovarHoras(aprovacaoInput);
    }
}
