package com.projetoWEG.domain.service;

import com.projetoWEG.domain.model.Alocacao;
import com.projetoWEG.domain.model.Apontamento;
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

    public List<Apontamento> listarApontamentosConsultor(Long id) {
        Consultor consultor = consultorService.buscarConsultor(id);
        Alocacao alocacao = new Alocacao();
        alocacao.setId_consultor(consultor.getId());
        return apontamentosRepository.findByAlocacaoConsultorId(alocacao.getId_consultor());
    }
}
