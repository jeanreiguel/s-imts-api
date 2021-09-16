package com.projetoWEG.api.model.dto.listagem;

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

    List<ProjetoConsultorDTO> projetos;

    List<AlocacaoConsultorDTO> alocacoes;

    UsuarioConsultorDTO usuario;

    Long limiteHoras;

    String status;

    List<RequisicaoDTO> requisicoes;
}
