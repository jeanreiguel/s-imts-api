package com.projetoWEG.api.assembler;

import com.projetoWEG.domain.model.Projeto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ProjetoAssembler {

    private ModelMapper modelMapper;

//    public ProjetoDTO toFornecedor(Projeto projeto) {
//        return modelMapper.map(projeto, ProjetoDTO.class);
//    }
}
