package com.projetoWEG.domain.service;

import com.projetoWEG.domain.exception.CasoException;
import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.model.StatusProjeto;
import com.projetoWEG.domain.repository.ProjetoRepository;
import lombok.AllArgsConstructor;
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
    public Projeto listarId(Long id) {
        return projetoRepository.findById(id)
                .orElseThrow(() -> new CasoException("Projeto não encontrado."));
    }
    public Projeto listarSecao(String secao) {
        return projetoRepository.findBySecaoName(secao)
                .orElseThrow(() -> new CasoException("Seção não encontrado."));
    }
    public List<Projeto> listarStatus(StatusProjeto status) {
        return projetoRepository.findByStatus(status);
    }
}
