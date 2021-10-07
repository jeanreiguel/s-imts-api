package com.projetoWEG.api.model.dto.aprovacao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
public class AprovacaoAlocacaoConsultorDTO {

    @Column(name = "nome_consultor")
    String nome;

    int limite_horas;

    List<ApontamentoConsultorDTO> apontamentos;
}
