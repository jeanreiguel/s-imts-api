package com.projetoWEG.domain.repository;

import com.projetoWEG.domain.model.Apontamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApontamentosRepository extends JpaRepository<Apontamento, Long> {

    Optional<Apontamento> findById(Long id);
}
