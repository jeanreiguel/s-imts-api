package com.projetoWEG.api.controller;

import com.projetoWEG.domain.model.Consultor;
import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.model.StatusConsultor;
import com.projetoWEG.domain.model.StatusProjeto;
import com.projetoWEG.domain.service.ConsultorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/consultores")
public class ConsultorController {

    private ConsultorService consultorService;
    @GetMapping
    public List<Consultor> listarConsultores() {
        return consultorService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consultor> listarConsultorId(@PathVariable Long id) {
        return consultorService.listarId(id);
    }
    @GetMapping("/id/{id}")
    public Consultor listarConsultorPorId(@PathVariable Long id) {
        return consultorService.buscarConsultor(id);
    }
    @GetMapping("/nome/{nome}")
    public ResponseEntity<Consultor> listarConsultorNome(@PathVariable String nome) {
        return consultorService.listarNome(nome);
    }
    @GetMapping("/nome/containing/{contain}")
    public List<Consultor> listarConsultorContaining(@PathVariable String contain) {
        return consultorService.listarContaining(contain);
    }
    @GetMapping("status/{status}")
    public List<Consultor> listarConsultorStatus(@PathVariable String status) {
        return consultorService.listarStatus(status);
    }
}
