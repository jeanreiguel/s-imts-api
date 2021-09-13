package com.projetoWEG.api.controller;

import com.projetoWEG.api.model.dto.RequisicaoDTO;
import com.projetoWEG.api.model.input.RequisicaoInputDTO;
import com.projetoWEG.domain.service.RequisicaoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/requisicao")
public class RequisicaoController {

    private RequisicaoService requisicaoService;

    @PostMapping
    public RequisicaoDTO gerarRequisicao(@RequestBody RequisicaoInputDTO requisicaoInputDTO) {
        return requisicaoService.gerarRequisicao(requisicaoInputDTO);
    }
}
