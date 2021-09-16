package com.projetoWEG.api.model.dto.aprovacao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AprovacaoAlocacaoDTO {

    private AprovacaoAlocacaoConsultorDTO idConsultor;

    private AprovacaoAlocacaoProjetoDTO idProjeto;

    private String skill;

    @Column(name = "horas_total")
    private int horasTotal;
}
