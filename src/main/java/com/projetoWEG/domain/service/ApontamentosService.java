package com.projetoWEG.domain.service;

import com.projetoWEG.api.assembler.ApontamentoAssembler;
import com.projetoWEG.api.model.dto.AprovacaoApontamentoDTO;
import com.projetoWEG.domain.repository.ApontamentosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ApontamentosService {

    private ApontamentosRepository apontamentosRepository;
    private ApontamentoAssembler apontamentosAssembler;

    public List<AprovacaoApontamentoDTO> listarTodos() {
        return apontamentosAssembler.toModelCollection(apontamentosRepository.findAll());
    }

    public List<AprovacaoApontamentoDTO> listarApontamentosConsultor(Long id) {
        //return apontamentosAssembler.toModelCollection(apontamentosRepository.findById(id));
        return null;
    }

}
