package com.projetoWEG.domain.service;

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

    public List<Apontamento> listarTodos() {
        return apontamentosRepository.findAll();
    }

    public ResponseEntity<Apontamento> listarApontamentosConsultor(Long id) {
        return apontamentosRepository.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
