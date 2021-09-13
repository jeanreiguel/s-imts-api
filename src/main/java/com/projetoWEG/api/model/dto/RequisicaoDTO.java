package com.projetoWEG.api.model.dto;

import com.projetoWEG.domain.model.Consultor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RequisicaoDTO {

    Long id;

    Consultor idConsultor;

    String nomeResponsavel;

    String descricao;

    LocalDateTime dataRequisicao;

    LocalDateTime dataApontamento;
}
