package com.projetoWEG.domain.repository;

import com.projetoWEG.domain.model.Secao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecaoRepository extends JpaRepository<Secao, Long> {
    List<Secao> findByNomeSecao(String nome);
}
