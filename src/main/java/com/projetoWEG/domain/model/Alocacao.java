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
    private Long id;

    @Valid
    @NotNull
    @JoinColumn(name = "id_consultor")
    @ManyToOne
    private Consultor idConsultor;

    @Valid
    @NotNull
    @JoinColumn(name = "id_projeto")
    @ManyToOne
    private Projeto idProjeto;

    @Valid
    @NotBlank
    private String skill;

    @Valid
    @NotNull
    @Column(name = "horas_total")
    private int horasTotal;

}
