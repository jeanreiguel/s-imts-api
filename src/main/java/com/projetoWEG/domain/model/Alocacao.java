package com.projetoWEG.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Time;

@Getter
@Setter
public class Alocacao {

    @Valid
    @NotNull
    @ManyToOne
    Long id_consultor;

    @Valid
    @NotNull
    @ManyToOne
    Long id_projeto;

    @Valid
    @NotBlank
    String skill;

    @Valid
    @NotNull
    int horas_total;
}
