package com.projetoWEG.api.controller;

import com.projetoWEG.api.assembler.RequisicaoAssembler;
import com.projetoWEG.api.model.dto.listagem.RequisicaoDTO;
import com.projetoWEG.api.model.input.RequisicaoInputDTO;
import com.projetoWEG.domain.model.Consultor;
import com.projetoWEG.domain.model.Requisicao;
import com.projetoWEG.domain.repository.ConsultorRepository;
import com.projetoWEG.domain.service.RequisicaoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/consultores/{consultorId}/requisicao")
public class RequisicaoController {

    private RequisicaoService requisicaoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RequisicaoDTO gerarRequisicao(@RequestBody RequisicaoInputDTO requisicaoInputDTO, Long consultorId) {
        return requisicaoService.gerarRequisicao(requisicaoInputDTO, consultorId);
    }

    @GetMapping
    public List<RequisicaoDTO> listarRequisicao(Long consultorId) {

        return requisicaoService.listarRequisicao(consultorId);
    }
}
