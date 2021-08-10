package com.projetoWEG.domain.service;

//import com.projetoWEG.domain.model.Alocacao;
import com.projetoWEG.domain.model.Apontamento;
import com.projetoWEG.domain.model.Aprovacao;
import com.projetoWEG.domain.model.Consultor;
import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.repository.ApontamentosRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ApontamentosService {

    private ConsultorService consultorService;
    private ProjetoService projetoService;
    private ApontamentosRepository apontamentosRepository;

    public Apontamento inserir(Apontamento apontamento) {
        return apontamentosRepository.save(apontamento);
    }

    public List<Apontamento> listarTodos() {
        return apontamentosRepository.findAll();
    }

    public ResponseEntity<Apontamento> listarApontamentosConsultor(Long id) {
        return apontamentosRepository.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
