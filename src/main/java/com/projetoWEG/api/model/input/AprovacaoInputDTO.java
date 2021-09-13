package com.projetoWEG.api.model.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Getter
@Setter
public class AprovacaoInputDTO {

    private String nomeFornecedor;

    private String nomeResponsavel;

    private int horasAprovadas;

    private double valorHora;

    private List<ApontamentoInputDTO> apontamentos = new ArrayList<>();

}
