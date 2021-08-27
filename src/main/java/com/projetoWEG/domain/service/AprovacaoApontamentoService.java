package com.projetoWEG.domain.service;

import com.projetoWEG.api.assembler.AprovacaoAssembler;
import com.projetoWEG.api.model.dto.AprovacaoDTO;
import com.projetoWEG.api.model.input.AprovacaoInput;
import com.projetoWEG.domain.exception.CasoException;
import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.model.Aprovacao;
import com.projetoWEG.domain.repository.ApontamentosRepository;
import com.projetoWEG.domain.repository.AprovacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@AllArgsConstructor
@Service
public class AprovacaoApontamentoService {

    AprovacaoRepository aprovacaoRepository;
    ApontamentosRepository apontamentosRepository;
    AprovacaoAssembler aprovacaoAssembler;

    public AprovacaoDTO aprovarHoras(AprovacaoInput aprovacaoInput) {

        List<Apontamento> apontamentos = new ArrayList<>();

        aprovacaoInput.getApontamentos().forEach(
                apontamento -> {
                    Apontamento apontamentoadd = apontamentosRepository.findById(apontamento.getId())
                                    .orElseThrow(() -> new CasoException("Apontamento não encontradO."));
                    apontamentoadd.setSituacaoApontamento("APROVADO");
                    apontamentos.add(apontamentoadd);
                }
        );
        Aprovacao aprovacao = aprovacaoAssembler.toEntity(aprovacaoInput);
        aprovacao.setApontamentos(apontamentos);
        aprovacaoRepository.save(aprovacao);
        return aprovacaoAssembler.toModel(aprovacao);
    }
    public List<AprovacaoDTO> listarAprovacoes() {
        return aprovacaoAssembler.toModelCollection(aprovacaoRepository.findAll());
    }
}
