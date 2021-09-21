package com.projetoWEG.domain.model;


import com.projetoWEG.domain.exception.CasoException;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "apontamentos")
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
    LocalDateTime data;

    @Valid
    @NotNull
    int horasTrabalhadas;

    @Valid
    @NotBlank
    String descricao;

    @NotNull
    String situacaoApontamento;

    public void aprovarApontamento() {

        if(this.getSituacaoApontamento() == "APROVADO") {
            throw new CasoException("Apontamento já aprovado.");
        }
        this.setSituacaoApontamento("APROVADO");
    }

    public void reprovarApontamento() {

        if(this.getSituacaoApontamento() == "REPROVADO") {
            throw new CasoException("Apontamento já reprovado.");
        }
        this.setSituacaoApontamento("REPROVADO");
    }

}