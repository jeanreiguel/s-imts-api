package com.projetoWEG.api.model.dto.aprovacao;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ApontamentoConsultorDTO {

    private Long id;

    private LocalDateTime data;

    private int horasTrabalhadas;

    private String descricao;

    private String situacaoApontamento;
}
