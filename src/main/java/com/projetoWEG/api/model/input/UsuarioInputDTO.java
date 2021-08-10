package com.projetoWEG.api.model.input;

import com.projetoWEG.domain.model.Role;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
public class UsuarioInputDTO {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String senha;

    private List<Role> roles;
}
