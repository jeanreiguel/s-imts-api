package com.projetoWEG.api.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ApontamentoDTO {

    private Long id;

    private Date data;

    private AlocacaoDTO alocacao;

    private int horasTrabalhadas;

    private String descricao;

    private String situacaoApontamento;
}
