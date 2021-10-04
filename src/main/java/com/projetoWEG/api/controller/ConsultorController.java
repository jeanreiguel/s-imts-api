package com.projetoWEG.api.controller;

import com.projetoWEG.api.model.dto.listagem.ConsultorDTO;
import com.projetoWEG.domain.service.ConsultorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/consultores")
public class ConsultorController {

    private ConsultorService consultorService;

    @GetMapping
    public List<ConsultorDTO> listarConsultores() {
        return consultorService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultorDTO>  listarConsultorId(@PathVariable Long id) {
        return consultorService.listarId(id);
    }
   @GetMapping("/nome/{nome}")
    public ResponseEntity<ConsultorDTO> listarConsultorNome(@PathVariable String nome) {
        return consultorService.listarNome(nome);
    }
    @GetMapping("/nome/containing/{contain}")
    public List<ConsultorDTO> listarConsultorContaining(@PathVariable String contain) {
        return consultorService.listarContaining(contain);
    }
    @GetMapping("status/{status}")
    public List<ConsultorDTO> listarConsultorStatus(@PathVariable String status) {
        return consultorService.listarStatus(status);
    }

}
