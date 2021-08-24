package com.projetoWEG.api.model.input;

import com.projetoWEG.domain.model.Apontamento;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class AprovacaoInput {

    @Valid
    @NotNull
    Date data;

    @Valid
    @NotBlank
    String nomeFornecedor;

    List<Apontamento> apontamento;

    @Valid
    @NotNull
    double valorHora;

}
