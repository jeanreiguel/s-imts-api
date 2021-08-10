package com.projetoWEG.domain.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "apontamentos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Apontamento {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_apontamento")
    Long id;

    @Valid
    @NotNull
    @ManyToOne
    @Embedded
    Alocacao alocacao;

    @Valid
    @NotNull
    Date data;

    @Valid
    @NotNull
    int horas_trabalhadas;

    @Valid
    @NotBlank
    String descricao;


}
