package com.projetoWEG.api.assembler;

import com.projetoWEG.api.model.dto.UsuarioDTO;
import com.projetoWEG.api.model.input.UsuarioInputDTO;
import com.projetoWEG.domain.model.Usuario;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class UsuarioAssembler {
     ModelMapper modelMapper;

    public UsuarioDTO toModel(Usuario usuario) {
        return modelMapper.map(usuario, UsuarioDTO.class);
    }
    public Usuario toEntity(UsuarioInputDTO usuarioInputDTO) {
        return modelMapper.map(usuarioInputDTO, Usuario.class);
    }
}
