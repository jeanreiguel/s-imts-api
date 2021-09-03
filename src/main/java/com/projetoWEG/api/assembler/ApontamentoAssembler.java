package com.projetoWEG.api.assembler;

import com.projetoWEG.api.model.dto.AprovacaoApontamentoDTO;
import com.projetoWEG.domain.model.Apontamento;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class ApontamentoAssembler {

    private ModelMapper modelMapper;

    public AprovacaoApontamentoDTO toModel(Apontamento apontamento) {
        return modelMapper.map(apontamento, AprovacaoApontamentoDTO.class);
    }
    public List<AprovacaoApontamentoDTO> toModelCollection(List<Apontamento> apontamentos) {
        return apontamentos.stream().map(this::toModel).collect(Collectors.toList());
    }
}
