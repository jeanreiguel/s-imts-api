package com.projetoWEG.domain.service;

import com.projetoWEG.api.assembler.ApontamentoAssembler;
import com.projetoWEG.api.assembler.AprovacaoAssembler;
import com.projetoWEG.api.assembler.RequisicaoAssembler;
import com.projetoWEG.api.model.dto.RequisicaoDTO;
import com.projetoWEG.api.model.dto.aprovacao.AprovacaoDTO;
import com.projetoWEG.api.model.input.AprovacaoInputDTO;
import com.projetoWEG.api.model.input.RequisicaoInputDTO;
import com.projetoWEG.domain.exception.CasoException;
import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.model.Aprovacao;
import com.projetoWEG.domain.model.Requisicao;
import com.projetoWEG.domain.repository.ApontamentosRepository;
import com.projetoWEG.domain.repository.AprovacaoRepository;
import com.projetoWEG.domain.repository.RequisicaoRepository;
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
    private ApontamentoAssembler apontamentoAssembler;

    public AprovacaoDTO aprovarHoras(AprovacaoInputDTO aprovacaoInput) {

        aprovacaoInput.getApontamentos().forEach(
                apontamento -> {
                    Apontamento apontamentoadd = apontamentosRepository.findById(apontamento.getId())
                                    .orElseThrow(() -> new CasoException("Apontamento não encontrado."));
                    if(apontamentoadd.getSituacaoApontamento() == "APROVADO") {
                        throw new CasoException("Apontamento já aprovado.");
                    } else {
                        apontamentoadd.setSituacaoApontamento("APROVADO");
                        apontamentosRepository.save(apontamentoadd);
                    }
                }
        );
        List<Apontamento> apontamentos = (apontamentoAssembler.toEntityCollection(aprovacaoInput.getApontamentos()));

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
