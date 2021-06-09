package com.projetoWEG.domain.model;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
public class Alocacao {

    @Valid
    @NotNull
    Consultor consultor;

    @Valid
    @NotNull
    Projeto projeto;

    @Valid
    @NotNull
    int horas_apontadas;
}
