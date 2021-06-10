package com.projetoWEG.domain.service;

import com.projetoWEG.domain.exception.CasoException;
import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.model.StatusProjeto;
import com.projetoWEG.domain.repository.ProjetoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProjetoService {

    private ProjetoRepository projetoRepository;

    public List<Projeto> listarTodos() {
        return projetoRepository.findAll();
    }

    public ResponseEntity<Projeto> listarId(Long id) {
        return projetoRepository.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    public ResponseEntity<Projeto> listarNome(String nome) {
        return projetoRepository.findByProjetoNome(nome).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    public List<Projeto> listarSecao(String secao) {
        return projetoRepository.findBySecaoName(secao);
    }
    public List<Projeto> listarStatus(StatusProjeto status) {
        return projetoRepository.findByStatus(status);
    }
}
