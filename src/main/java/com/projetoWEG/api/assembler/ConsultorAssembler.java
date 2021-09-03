package com.projetoWEG.api.assembler;

import com.projetoWEG.api.model.dto.ConsultorDTO;
import com.projetoWEG.domain.model.Consultor;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class ConsultorAssembler {

    private ModelMapper modelMapper;

    public ConsultorDTO toFornecedor(Consultor consultor) {
        return modelMapper.map(consultor, ConsultorDTO.class);
    }

    public List<ConsultorDTO> toFornecedorCollection(List<Consultor> consultores) {
        return consultores.stream().map(this::toFornecedor).collect(Collectors.toList());
    }
}
