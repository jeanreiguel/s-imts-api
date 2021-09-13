package com.projetoWEG.domain.service;

import com.projetoWEG.api.assembler.ApontamentoAssembler;
import com.projetoWEG.api.model.dto.aprovacao.AprovacaoApontamentoDTO;
import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.repository.ApontamentosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ApontamentosService {

    private ApontamentosRepository apontamentosRepository;

    private ApontamentoAssembler apontamentosAssembler;

    public List<AprovacaoApontamentoDTO> listarTodos() {
        return apontamentosAssembler.toModelCollection(apontamentosRepository.findAll());
    }

    public Optional<Apontamento> listarApontamento(Long id) {
        return apontamentosRepository.findById(id);
    }

}
