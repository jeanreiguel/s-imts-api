package com.projetoWEG.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Alocacao {

    @Valid
    @NotNull
    long id_consultor;

    @Valid
    @NotNull
    long id_projeto;

    @Valid
    @NotBlank
    String skill;

    @Valid
    @NotNull
    int horas_total;

}
