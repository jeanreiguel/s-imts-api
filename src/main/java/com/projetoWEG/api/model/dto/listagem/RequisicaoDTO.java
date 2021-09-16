package com.projetoWEG.api.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RequisicaoDTO {

    Long id;

    String nomeResponsavel;

    String descricao;

    LocalDateTime dataRequisicao;

}
