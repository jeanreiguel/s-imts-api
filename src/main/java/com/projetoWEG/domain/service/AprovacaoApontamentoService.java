package com.projetoWEG.domain.service;

import com.projetoWEG.api.assembler.AprovacaoAssembler;
import com.projetoWEG.api.model.dto.aprovacao.AprovacaoDTO;
import com.projetoWEG.api.model.input.AprovacaoInputDTO;
import com.projetoWEG.domain.exception.CasoException;
import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.model.Aprovacao;
import com.projetoWEG.domain.repository.ApontamentosRepository;
import com.projetoWEG.domain.repository.AprovacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class AprovacaoApontamentoService {

    private AprovacaoRepository aprovacaoRepository;
    private ApontamentosRepository apontamentosRepository;
    private AprovacaoAssembler aprovacaoAssembler;

    public AprovacaoDTO aprovarHoras(AprovacaoInputDTO aprovacaoInput) {

        List<Apontamento> apontamentos = new ArrayList<>();

        aprovacaoInput.getApontamentos().forEach(
                apontamento -> {
                    Apontamento apontamentoadd = apontamentosRepository.findById(apontamento.getId())
                                    .orElseThrow(() -> new CasoException("Apontamento não encontrado."));
                    apontamentoadd.setId(apontamento.getId());
                    apontamentoadd.setSituacaoApontamento("APROVADO");
                    apontamentos.add(apontamentoadd);
                }
        );
        Aprovacao aprovacao = aprovacaoAssembler.toEntity(aprovacaoInput);
        aprovacao.setApontamentos(apontamentos);
        aprovacao.setData(LocalDateTime.now());

        aprovacaoRepository.save(aprovacao);
        return aprovacaoAssembler.toModel(aprovacao);
    }
    public List<AprovacaoDTO> listarAprovacoes() {
        return aprovacaoAssembler.toModelCollection(aprovacaoRepository.findAll());
    }
}
