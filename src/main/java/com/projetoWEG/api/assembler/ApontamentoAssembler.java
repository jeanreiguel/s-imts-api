package com.projetoWEG.api.assembler;

import com.projetoWEG.api.model.dto.ApontamentoDTO;
import com.projetoWEG.domain.model.Apontamento;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ApontamentoAssembler {

    private ModelMapper modelMapper;

    public ApontamentoDTO toModel(Apontamento apontamento) {
        return modelMapper.map(apontamento, ApontamentoDTO.class);
    }
    public List<ApontamentoDTO> toModelCollection(List<Apontamento> apontamentos) {
        return apontamentos.stream().map(this::toModel).collect(Collectors.toList());
    }
}
