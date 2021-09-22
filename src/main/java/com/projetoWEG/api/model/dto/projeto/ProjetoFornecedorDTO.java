package com.projetoWEG.api.model.dto;

import com.projetoWEG.api.model.dto.listagem.ProjetoConsultorDTO;
import com.projetoWEG.domain.model.Secao;
import com.projetoWEG.domain.model.Skill;
import com.projetoWEG.domain.model.StatusProjeto;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter

public class ProjetoFornecedorDTO {

    @Column(name = "id_projeto")
    Long id;

    @Column(name = "secao_projeto")
    Secao secao;

    @Column(name = "nome_projeto")
    String nome;

    @Column(name = "descricao_projeto")
    String descricao;

    List<ProjetoConsultorDTO> consultores;

    List<ProjetoApontamentoDTO> apontamentos;

    List<Skill> skills;

    @Column(name = "status_projeto")
    StatusProjeto status;

    Date dataInicio;

    Date dataFim;

    int horasApontadas;

   int horasTotal;

}
