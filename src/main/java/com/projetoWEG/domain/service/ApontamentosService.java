package com.projetoWEG.domain.service;

import com.projetoWEG.api.model.dto.ApontamentoDTO;
import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.repository.ApontamentosRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ApontamentosService {

    private ApontamentosRepository apontamentosRepository;
    private ApontamentosAssembler apontamentosAssembler;

    public List<ApontamentoDTO> listarTodos() {
        return apontamentosRepository.findAll();
    }

    public ResponseEntity<ApontamentoDTO> listarApontamentosConsultor(Long id) {
        return apontamentosRepository.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
