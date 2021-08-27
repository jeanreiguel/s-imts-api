package com.projetoWEG.api.model.dto;

import com.projetoWEG.domain.model.Alocacao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
public class ApontamentoDTO {

    private Long id;


    private Date data;

    private int horasTrabalhadas;

    private String descricao;

    private String situacaoApontamento;
}
