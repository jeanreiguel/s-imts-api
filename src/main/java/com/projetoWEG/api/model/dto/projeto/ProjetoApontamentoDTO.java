package com.projetoWEG.api.model.dto.projeto;

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
