package com.projetoWEG.api.model.dto.aprovacao;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AprovacaoApontamentoDTO {

    private Long id;

    private Date data;

    private AprovacaoAlocacaoDTO alocacao;

    private int horasTrabalhadas;

    private String descricao;

    private String situacaoApontamento;
}
