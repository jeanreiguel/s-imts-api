package com.projetoWEG.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
@Entity(name = "consultor_alocacao")
public class Alocacao {

    @Id
    @Valid
    @NotNull
    Long idConsultor;

    @Valid
    @NotNull
    Long idProjeto;

    @Valid
    @NotBlank
    String skill;

    @Valid
    @NotNull
    int horasTotal;

}
