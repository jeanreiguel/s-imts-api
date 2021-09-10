package com.projetoWEG.api.model.dto.aprovacao;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AprovacaoDTO {

    private Date data;

    private String nomeFornecedor;

    private String nomeResponsavel;

    private int horasAprovadas;

    private double valorHora;

    private List<AprovacaoApontamentoDTO> apontamentos;
}
