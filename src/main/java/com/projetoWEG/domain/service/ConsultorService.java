package com.projetoWEG.domain.service;

import com.projetoWEG.domain.exception.CasoException;
import com.projetoWEG.domain.model.Consultor;
import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.model.StatusConsultor;
import com.projetoWEG.domain.model.StatusProjeto;
import com.projetoWEG.domain.repository.ConsultorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ConsultorService {

    private ConsultorRepository consultorRepository;

    public List<Consultor> listarTodos() {
        return consultorRepository.findAll();
    }

    public ResponseEntity<Consultor> listarId(Long id) {
        return consultorRepository.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    public ResponseEntity<Consultor> listarNome(String nome) {
        return consultorRepository.findByConsultorNome(nome).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    public List<Consultor> listarContaining(String contain) {
        return consultorRepository.findByContaining(contain);
    }
    public List<Consultor> listarStatus(StatusConsultor status) {
        return consultorRepository.findByConsultorStatus(status);
    }
}
