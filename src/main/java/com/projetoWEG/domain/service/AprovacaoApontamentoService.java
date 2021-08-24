package com.projetoWEG.domain.service;

import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.model.Aprovacao;
import com.projetoWEG.domain.repository.AprovacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@AllArgsConstructor
@Service
public class AprovacaoApontamentoService {

    AprovacaoRepository aprovacaoRepository;

    public Aprovacao aprovarHoras(/*List<Apontamento> apontamentos,*/ Aprovacao aprovacao) {
//        aprovacao.setApontamento(apontamentos);

//        aprovacao.getApontamento().stream().map(apontamento -> {
//            aprovacao.setHorasAprovadas(apontamento.getHorasTrabalhadas() + aprovacao.getHorasAprovadas());
//            return aprovacao.getHorasAprovadas();
//        });


        return aprovacaoRepository.save(aprovacao);
    }
}
