package com.projetoWEG.domain.repository;

import com.projetoWEG.domain.model.Alocacao;
import com.projetoWEG.domain.model.Consultor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlocacaoRepository extends JpaRepository<Alocacao, Long> {
}
