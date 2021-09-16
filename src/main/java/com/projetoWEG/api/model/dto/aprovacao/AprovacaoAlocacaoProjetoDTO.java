package com.projetoWEG.api.model.dto.aprovacao;

import com.projetoWEG.domain.model.StatusProjeto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
public class AprovacaoAlocacaoProjetoDTO {

    @Column(name = "id_projeto")
    Long id;

    @Column(name = "secao_projeto")
    String secao;

    @Column(name = "nome_projeto")
    String nome;

}
