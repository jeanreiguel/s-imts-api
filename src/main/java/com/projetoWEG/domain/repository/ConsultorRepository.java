package com.projetoWEG.domain.repository;

import com.projetoWEG.domain.model.Consultor;
import com.projetoWEG.domain.model.StatusConsultor;

import java.util.List;
import java.util.Optional;

public interface ConsultorRepository {
    Optional<Consultor> findById(String id);

    List<Consultor> findByStatus(StatusConsultor status);
}
