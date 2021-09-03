package com.projetoWEG.api.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class ConsultorAprovacaoDTO {

    @Column(name = "nome_consultor")
    String nome;

    @Column(name = "skill_consultor")
    String skill;

    int limite_horas;
}
