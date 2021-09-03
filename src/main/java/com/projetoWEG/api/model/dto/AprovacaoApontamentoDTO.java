package com.projetoWEG.api.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ApontamentoAprovacaoDTO {

    private Long id;

    private Date data;

    private AlocacaoAprovacaoDTO alocacao;

    private int horasTrabalhadas;

    private String descricao;

    private String situacaoApontamento;
}
