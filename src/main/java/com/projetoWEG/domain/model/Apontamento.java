package com.projetoWEG.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "apontamentos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Apontamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Valid
    @NotNull
    @Embedded
    Alocacao alocacao;

    @Valid
    @NotNull
    int horas_trabalhadas;

    @Valid
    @NotBlank
    String descricao;
}
