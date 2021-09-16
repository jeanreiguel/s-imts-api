package com.projetoWEG.api.model.dto.listagem;

import com.projetoWEG.api.model.dto.aprovacao.ApontamentoProjetoDTO;
import com.projetoWEG.domain.model.Alocacao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
public class ProjetoConsultorDTO {

    Long id;

    String nome;

}
