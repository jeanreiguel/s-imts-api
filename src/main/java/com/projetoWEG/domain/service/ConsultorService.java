package com.projetoWEG.domain.service;

import com.projetoWEG.domain.exception.CasoException;
import com.projetoWEG.domain.model.Consultor;
import com.projetoWEG.domain.model.StatusConsultor;
import com.projetoWEG.domain.repository.ConsultorRepository;

import java.util.List;

public class ConsultorService {

    private ConsultorRepository consultorRepository;

    public Consultor listarId(String id) {
        return consultorRepository.findById(id)
                .orElseThrow(() -> new CasoException   ("Consultor inexistente existente."));
    }
    public Consultor listarNome(String name) {
        return consultorRepository.findById(name)
                .orElseThrow(() -> new CasoException   ("Consultor inexistente existente."));
    }
    public List<Consultor> listarStatus(StatusConsultor status) {
        return consultorRepository.findByStatus(status);
    }
}
