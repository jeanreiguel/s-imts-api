package com.projetoWEG.api.model.dto.projeto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjetoAlocacaoApontamentoDTO {

    ProjetoAlocacaoConsultorDTO idConsultor;

    ProjetoAlocacaoSkillDTO skill;

    private int horasTotal;

}
