package com.projetoWEG.api.model.dto.aprovacao;

import com.projetoWEG.domain.model.Skill;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.math.BigDecimal;

@Getter
@Setter
public class AprovacaoConsultorDTO {

    @Column(name = "nome_consultor")
    String nome;

    @Column(name = "skill_consultor")
    Skill skill;

    int limiteHoras;

    BigDecimal valorHoras;
}
