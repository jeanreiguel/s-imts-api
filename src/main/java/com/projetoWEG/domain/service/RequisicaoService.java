package com.projetoWEG.domain.service;

import com.projetoWEG.api.assembler.RequisicaoAssembler;
import com.projetoWEG.api.model.dto.listagem.RequisicaoDTO;
import com.projetoWEG.api.model.input.RequisicaoInputDTO;
import com.projetoWEG.domain.model.Consultor;
import com.projetoWEG.domain.model.Requisicao;
import com.projetoWEG.domain.repository.ConsultorRepository;
import com.projetoWEG.domain.repository.RequisicaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class RequisicaoService {

    private RequisicaoAssembler requisicaoAssembler;
    private ConsultorRepository consultorRepository;

    public RequisicaoDTO gerarRequisicao(RequisicaoInputDTO requisicaoInputDTO, Long consultorId) {

        Consultor consultor = consultorRepository.findById(consultorId).orElseThrow();

        Requisicao requisicao = requisicaoAssembler.toEntity(requisicaoInputDTO);

        consultor.adicionarRequisicao(requisicao);

        return requisicaoAssembler.toModel(requisicao);
    }

    public List<RequisicaoDTO> listarRequisicao(Long consultorId) {

        Consultor consultor = consultorRepository.findById(consultorId).orElseThrow();

        return requisicaoAssembler.toModelCollection(consultor.getRequisicoes());
    }
}
