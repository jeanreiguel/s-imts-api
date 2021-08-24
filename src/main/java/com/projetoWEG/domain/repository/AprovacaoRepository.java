package com.projetoWEG.domain.repository;

import com.projetoWEG.domain.model.Aprovacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AprovacaoRepository extends JpaRepository<Aprovacao, Long> {
}
