package com.projetoWEG.domain.model;

import com.projetoWEG.api.model.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class  AuthenticationResponse {
    private String jwt;
    private UsuarioDTO usuario;
}
