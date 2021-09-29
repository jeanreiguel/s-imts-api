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
import com.projetoWEG.domain.repository.ConsultorRepository;
import com.projetoWEG.domain.repository.ProjetoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class AprovacaoService {

    private AprovacaoRepository aprovacaoRepository;
    private ApontamentosRepository apontamentosRepository;
    private AprovacaoAssembler aprovacaoAssembler;
    private ProjetoRepository projetoRepository;
    private ConsultorRepository consultorRepository;

    public AprovacaoDTO aprovarHoras(AprovacaoInputDTO aprovacaoInput) {

        Aprovacao aprovacao = aprovacaoAssembler.toEntity(aprovacaoInput);
        List<Apontamento> aprovados = new ArrayList<>();

        aprovacaoInput.getApontamentos().forEach(apontamento -> {
            Apontamento apontamentoadd = apontamentosRepository.findById(apontamento.getId())
                    .orElseThrow(() -> new CasoException("Apontamento não encontrado"));

            aprovados.add(apontamentoadd);
        });

        aprovacao.setApontamentos(aprovados);

        aprovacao.getApontamentos().forEach(
            apontamento -> {

                apontamento.aprovarApontamento();
                apontamento.getAlocacao().atualizarHoras(apontamento);

                Projeto projeto = projetoRepository.findById(
                        apontamento.getAlocacao().getIdProjeto()
                                .getId()) .orElseThrow(() -> new CasoException("Projeto não encontrado."));

                projeto.atualizarHoras(apontamento);

                apontamentosRepository.save(apontamento);
                projetoRepository.save(projeto);
            }
        );
        System.out.println(aprovacaoInput.getIdConsultor());
        aprovacao.setIdConsultor(consultorRepository.findById(aprovacaoInput.getIdConsultor())
                .orElseThrow(() -> new CasoException("Consultor não encontrado")));
        aprovacao.setData(LocalDateTime.now());

        aprovacaoRepository.save(aprovacao);
        return aprovacaoAssembler.toModel(aprovacao);
    }
    public List<AprovacaoDTO> listarAprovacoes() {
        return aprovacaoAssembler.toModelCollection(aprovacaoRepository.findAll());
    }
}
