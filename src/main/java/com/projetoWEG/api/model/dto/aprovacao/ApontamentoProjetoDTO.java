package com.projetoWEG.api.model.dto.aprovacao;

import com.projetoWEG.api.model.dto.AlocacaoProjetoDTO;
import com.projetoWEG.api.model.dto.ProjetoAlocacaoDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApontamentoProjetoDTO {

    private Long id;

    private AlocacaoProjetoDTO alocacao;

    private int horasTrabalhadas;

    private String situacaoApontamento;
}
