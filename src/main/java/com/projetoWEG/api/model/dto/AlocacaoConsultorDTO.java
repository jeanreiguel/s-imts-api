package com.projetoWEG.api.model.dto;

import com.projetoWEG.api.model.dto.aprovacao.AprovacaoProjetoDTO;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AlocacaoConsultorDTO {

    AprovacaoProjetoDTO idProjeto;

    String skill;

    int horasTotal;
}
