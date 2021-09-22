package com.projetoWEG.domain.service;

import com.projetoWEG.domain.model.Secao;
import com.projetoWEG.domain.repository.SecaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SecaoService {

    private SecaoRepository secaoRepository;

    public List<Secao> listarTodos() {
        return secaoRepository.findAll();
    }
}
