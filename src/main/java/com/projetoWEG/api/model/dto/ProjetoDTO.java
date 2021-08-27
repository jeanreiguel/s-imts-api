package com.projetoWEG.api.model.dto;

import com.projetoWEG.domain.model.StatusProjeto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter

public class ProjetoDTO {

    @Column(name = "id_projeto")
    Long id;

    @Column(name = "secao_projeto")
    String secao;
    @Column(name = "nome_projeto")
    String nome;

    @Column(name = "descricao_projeto")
    String descricao;

    @Column(name = "status_projeto")
    StatusProjeto status;

    String data_inicio;

    String data_fim;

    int horas_apontadas;

   int horas_total;

}
