package com.projetoWEG.api.model.dto;

import com.projetoWEG.domain.model.Skill;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjetoAlocacaoApontamentoDTO {

    ProjetoAlocacaoConsultorDTO idConsultor;

    ProjetoAlocacaoSkillDTO skill;

    private int horasTotal;

}
