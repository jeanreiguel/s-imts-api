package com.projetoWEG.api.controller;

import com.projetoWEG.api.assembler.ProjetoAssembler;
import com.projetoWEG.api.model.dto.ProjetoFornecedorDTO;
import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.model.StatusProjeto;
import com.projetoWEG.domain.service.ProjetoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private ProjetoService projetoService;
    private ProjetoAssembler projetoAssembler;

    @GetMapping
    public List<ProjetoFornecedorDTO> listarProjetos() {
        return projetoAssembler.toFornecedorCollection(projetoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoFornecedorDTO> listarProjetoId(@PathVariable Long id) {
        return projetoService.listarId(id);
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<ProjetoFornecedorDTO> listarProjetoNome(@PathVariable String nome) {
        return projetoService.listarNome(nome);
    }

    @GetMapping("/secao/{secao}")
    public List<ProjetoFornecedorDTO> listarProjetosSecao(@PathVariable String secao) {
        return projetoAssembler.toFornecedorCollection(projetoService.listarSecao(secao));
    }

    @GetMapping("/status/{status}")
    public List<ProjetoFornecedorDTO> listarProjetosStatus(@PathVariable StatusProjeto status) {
        return projetoAssembler.toFornecedorCollection(projetoService.listarStatus(status));
    }

    @GetMapping("/nome/containing/{contain}")
    public List<ProjetoFornecedorDTO> listarProjetosContaining(@PathVariable String contain) {
        return projetoAssembler.toFornecedorCollection(projetoService.listarContaining(contain));
    }
}
