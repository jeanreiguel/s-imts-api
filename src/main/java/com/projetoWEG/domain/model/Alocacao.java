package com.projetoWEG.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Embeddable
public class Alocacao {

    @Valid
    @NotNull
    @ManyToOne
    Consultor consultor;

    @Valid
    @NotNull
    @ManyToOne
    Projeto projeto;

    @Valid
    @NotBlank
    String skill;

    @Valid
    @NotNull
    int horas_total;
}
