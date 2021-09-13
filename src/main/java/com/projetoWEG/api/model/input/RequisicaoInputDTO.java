package com.projetoWEG.api.model.input;

import com.projetoWEG.domain.model.Consultor;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class RequisicaoInputDTO {

    Consultor idConsultor;

    String nomeResponsavel;

    String descricao;
}
