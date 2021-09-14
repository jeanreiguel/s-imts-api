package com.projetoWEG.api.model.dto;

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

     List<AlocacaoConsultorDTO> alocacoes;

    UsuarioDTO usuario;

    Long limiteHoras;

    String status;

    List<RequisicaoDTO> requisicoes;
}
