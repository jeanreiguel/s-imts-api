package com.projetoWEG.domain.service;

import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.model.StatusProjeto;
import com.projetoWEG.domain.repository.ProjetoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return projetoRepository.findByNome(nome).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    public List<Projeto> listarSecao(String secao) {
        return projetoRepository.findBySecao(secao);
    }

    public List<Projeto> listarContaining(String contain) {
        return projetoRepository.findByNomeContaining(contain);
    }
    public List<Projeto> listarStatus(StatusProjeto status) {
        return projetoRepository.findByStatus(status);
    }
}
