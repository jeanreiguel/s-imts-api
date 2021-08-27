package com.projetoWEG.api.model.dto;

import com.projetoWEG.domain.model.Apontamento;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    private List<ApontamentoDTO> apontamentos;
}
