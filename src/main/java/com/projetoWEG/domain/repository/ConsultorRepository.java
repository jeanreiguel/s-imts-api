package com.projetoWEG.domain.repository;

import com.projetoWEG.domain.model.Consultor;
import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.model.StatusConsultor;
import com.projetoWEG.domain.model.StatusProjeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConsultorRepository extends JpaRepository<Consultor, Long> {
    Optional<Consultor> findById(String id);

    Optional<Consultor> findById(Long id);
    Optional<Consultor> findByConsultorNome(String name);
    List<Consultor> findByConsultorStatus(StatusConsultor status);
    List<Consultor> findByContaining(String contain);
}
