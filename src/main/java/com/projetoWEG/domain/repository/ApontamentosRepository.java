package com.projetoWEG.domain.repository;

import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.service.ApontamentosService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApontamentosRepository extends JpaRepository<Apontamento, Long> {

    List<Apontamento> findByAlocacaoConsultorId(Long id);
}
