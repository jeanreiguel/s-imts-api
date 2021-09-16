package com.projetoWEG.domain.service;

import com.projetoWEG.api.assembler.ApontamentoAssembler;
import com.projetoWEG.api.assembler.AprovacaoAssembler;
import com.projetoWEG.api.model.dto.aprovacao.AprovacaoDTO;
import com.projetoWEG.api.model.input.AprovacaoInputDTO;
import com.projetoWEG.domain.exception.CasoException;
import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.model.Aprovacao;
import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.repository.ApontamentosRepository;
import com.projetoWEG.domain.repository.AprovacaoRepository;
import com.projetoWEG.domain.repository.ProjetoRepository;
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
    private ProjetoRepository projetoRepository;

    public AprovacaoDTO aprovarHoras(AprovacaoInputDTO aprovacaoInput) {

        List<Apontamento> aprovados = apontamentoAssembler.toEntityCollection(aprovacaoInput.getApontamentos());

        aprovados.forEach(
                apontamento -> {
                    Apontamento apontamentoadd = apontamentosRepository.findById(apontamento.getId())
                                    .orElseThrow(() -> new CasoException("Apontamento não encontrado."));
                    if(apontamentoadd.getSituacaoApontamento() == "APROVADO") {
                        throw new CasoException("Apontamento já aprovado.");
                    } else {
                        apontamento.setSituacaoApontamento("APROVADO");
                        apontamento.setHorasTrabalhadas(apontamentoadd.getHorasTrabalhadas());
                        apontamento.setAlocacao(apontamentoadd.getAlocacao());
                        apontamento.setData(apontamentoadd.getData());
                        apontamento.setDescricao(apontamentoadd.getDescricao());

                        Projeto projeto = projetoRepository.findById(
                                apontamentoadd.getAlocacao().getIdProjeto()
                                        .getId()) .orElseThrow(() -> new CasoException("Projeto não encontrado."));
                        projeto.setHorasApontadas(projeto.getHorasApontadas() + apontamento.getHorasTrabalhadas());

                        apontamentosRepository.save(apontamento);
                    }
                }
        );

        Aprovacao aprovacao = aprovacaoAssembler.toEntity(aprovacaoInput);
        aprovacao.setApontamentos(aprovados);
        aprovacao.setData(LocalDateTime.now());

        aprovacaoRepository.save(aprovacao);
        return aprovacaoAssembler.toModel(aprovacao);
    }
    public List<AprovacaoDTO> listarAprovacoes() {
        return aprovacaoAssembler.toModelCollection(aprovacaoRepository.findAll());
    }
}
