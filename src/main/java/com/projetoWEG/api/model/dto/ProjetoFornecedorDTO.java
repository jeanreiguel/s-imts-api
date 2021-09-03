package com.projetoWEG.api.model.dto;

import com.projetoWEG.domain.model.StatusProjeto;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter

public class ProjetoFornecedorDTO {

    @Column(name = "id_projeto")
    Long id;

    @Column(name = "secao_projeto")
    String secao;
    @Column(name = "nome_projeto")
    String nome;

    @Column(name = "descricao_projeto")
    String descricao;

    List<ProjetoConsultorDTO> consultores;

    @Column(name = "status_projeto")
    StatusProjeto status;


    String data_inicio;

    String data_fim;

    int horas_apontadas;

   int horas_total;

}
