package com.projetoWEG.domain.model;

import com.projetoWEG.domain.exception.CasoException;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "consultor_alocacao")
public class Alocacao {

    @Id
    Long id;

    @Valid
    @NotNull
    @JoinColumn(name = "id_consultor")
    @ManyToOne
    Consultor idConsultor;

    @Valid
    @NotNull
    @JoinColumn(name = "id_projeto")
    @ManyToOne
    Projeto idProjeto;

    @Valid
    @OneToOne
    @JoinColumn(name = "skill_id")
    Skill skill;

    @Valid
    @NotNull
    @Column(name = "horas_total")
    int horasTotal;

    public void atualizarHoras(Apontamento apontamento) {
        if(this.getHorasTotal() >= apontamento.getHorasTrabalhadas()) {
            this.setHorasTotal(this.getHorasTotal() - apontamento.getHorasTrabalhadas());
        } else {
            throw new CasoException("Horas apontadas ultrapassam o limite");
        }
    }
}
