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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "apontamentos")
public class Apontamento {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_apontamento")
    private Long id;

    @Valid
    @NotNull
    @ManyToOne
    @Embedded
    private Alocacao alocacao;

    @Valid
    @NotNull
    private Date data;

    @Valid
    @NotNull
    private int horasTrabalhadas;

    @Valid
    @NotBlank
    private String descricao;

    @NotNull
    private String situacaoApontamento;
}
