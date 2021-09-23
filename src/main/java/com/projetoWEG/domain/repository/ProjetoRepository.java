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
    Optional<Projeto> findByNome(String name);
    List<Projeto> findBySecao_nomeSecao(String secao);
    List<Projeto> findByStatus(StatusProjeto status);
    List<Projeto> findByNomeContaining(String contain);
}
