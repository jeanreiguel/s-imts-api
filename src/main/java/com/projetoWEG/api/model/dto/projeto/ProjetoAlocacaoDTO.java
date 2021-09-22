package com.projetoWEG.api.model.dto.projeto;

import com.projetoWEG.domain.model.Skill;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjetoAlocacaoDTO {

    private Long idProjeto;

    private Skill skill;

}