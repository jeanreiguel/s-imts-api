package com.projetoWEG.api.model.dto;

import com.projetoWEG.domain.model.Consultor;
import com.projetoWEG.domain.model.Projeto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AlocacaoDTO {


    private ConsultorDTO idConsultor;

    private ProjetoDTO idProjeto;

    @Valid
    @NotBlank
    private String skill;

    @Valid
    @NotNull
    @Column(name = "horas_total")
    private int horasTotal;
}
