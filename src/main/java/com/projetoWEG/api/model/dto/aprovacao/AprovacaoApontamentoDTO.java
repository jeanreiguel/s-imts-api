package com.projetoWEG.api.model.dto.aprovacao;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class AprovacaoApontamentoDTO {

    private Long id;

    private LocalDateTime data;

    private AprovacaoAlocacaoDTO alocacao;

    private int horasTrabalhadas;

    private String descricao;

    private String situacaoApontamento;
}
