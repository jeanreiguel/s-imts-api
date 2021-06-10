package com.projetoWEG.domain.repository;

import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.model.StatusProjeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

    Optional<Projeto> findById(Long id);
    Optional<Projeto> findByProjetoNome(String name);
    List<Projeto> findBySecaoName(String name);
    List<Projeto> findByStatus(StatusProjeto status);
    List<Projeto> findByContaining(String contain);
}
