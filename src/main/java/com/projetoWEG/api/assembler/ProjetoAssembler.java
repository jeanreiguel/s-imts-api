package com.projetoWEG.api.assembler;

import com.projetoWEG.api.model.dto.ProjetoFornecedorDTO;
import com.projetoWEG.domain.model.Projeto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class ProjetoAssembler {

    private ModelMapper modelMapper;

    public ProjetoFornecedorDTO toFornecedor(Projeto projeto) {
        return modelMapper.map(projeto, ProjetoFornecedorDTO.class);
    }
    public List<ProjetoFornecedorDTO> toFornecedorCollection(List<Projeto> projetos) {
        return projetos.stream().map(this::toFornecedor).collect(Collectors.toList());
    }
}
