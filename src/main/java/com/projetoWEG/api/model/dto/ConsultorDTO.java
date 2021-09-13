package com.projetoWEG.api.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class ConsultorDTO {

    @Column(name = "cadastro_consultor")
    Long id;

    @Column(name = "nome_consultor")
    String nome;

    UsuarioDTO usuario;

    @Column(name = "skill_consultor")
    String skill;

    int limite_horas;

    String status;

}
