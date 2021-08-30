package com.projetoWEG.domain.repository;

import com.projetoWEG.domain.model.Consultor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConsultorRepository extends JpaRepository<Consultor, Long> {
    Optional<Consultor> findByNome(String name);
    List<Consultor> findByStatus(String status);
    List<Consultor> findByNomeContaining(String contain);
}
