package com.projetoWEG.api.assembler;

import com.projetoWEG.api.model.dto.listagem.RequisicaoDTO;
import com.projetoWEG.api.model.input.RequisicaoInputDTO;
import com.projetoWEG.domain.model.Requisicao;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class RequisicaoAssembler {

    private ModelMapper modelMapper;

    public Requisicao toEntity(RequisicaoInputDTO requisicaoInputDTO) {
        return modelMapper.map(requisicaoInputDTO, Requisicao.class);
    }
    public RequisicaoDTO toModel(Requisicao requisicao) {
        return modelMapper.map(requisicao, RequisicaoDTO.class);
    }

    public List<RequisicaoDTO> toModelCollection(List<Requisicao> requisicoes) {
        return requisicoes.stream().map(this::toModel).collect(Collectors.toList());
    }
}
