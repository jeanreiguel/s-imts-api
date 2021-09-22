package com.projetoWEG.api.model.dto;

import com.projetoWEG.api.model.dto.ProjetoAlocacaoApontamentoDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjetoApontamentoDTO {

    private Long id;

    private ProjetoAlocacaoApontamentoDTO alocacao;

    private int horasTrabalhadas;

    private String situacaoApontamento;
}
