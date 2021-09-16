package com.projetoWEG.domain.service;

import com.projetoWEG.api.assembler.ConsultorAssembler;
import com.projetoWEG.api.model.dto.listagem.ConsultorDTO;
import com.projetoWEG.domain.exception.CasoException;
import com.projetoWEG.domain.repository.ConsultorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ConsultorService {

    private ConsultorRepository consultorRepository;
    private ConsultorAssembler consultorAssembler;

    public List<ConsultorDTO> listarTodos() {
        return consultorAssembler.toFornecedorCollection(consultorRepository.findAll());
    }

    public ResponseEntity<ConsultorDTO> listarId(Long id) {
        return consultorRepository.findById(id).map(consultor -> {
            return ResponseEntity.ok(consultorAssembler.toFornecedor(consultor));
        }).orElseThrow(() -> new CasoException("Consultor não encontrado."));
    }
    public ResponseEntity<ConsultorDTO> listarNome(String nome) {
        return consultorRepository.findByNome(nome).map(consultor -> {
            return ResponseEntity.ok(consultorAssembler.toFornecedor(consultor));
        }).orElseThrow(() -> new CasoException("Consultor não encontrado."));
    }
    public List<ConsultorDTO> listarContaining(String contain) {
        return consultorAssembler.toFornecedorCollection(consultorRepository.findByNomeContaining(contain));
    }
    public List<ConsultorDTO> listarStatus(String status) {
        return consultorAssembler.toFornecedorCollection(consultorRepository.findByStatus(status));
    }

}
