package com.projetoWEG.api.model.dto;

import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.model.Usuario;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
public class ConsultorDTO {

    @Column(name = "cadastro_consultor")
    Long id;

    @Column(name = "nome_consultor")
    String nome;

    Usuario usuario;

    @Column(name = "skill_consultor")
    String skill;

    String limite_horas;

    String status;

}
