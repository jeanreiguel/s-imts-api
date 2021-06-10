package com.projetoWEG.domain.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Requisicao {

    @Valid
    @NotBlank
    String nome_consultor;

    @Valid
    @NotBlank
    String nome_responsavel;

    @Valid
    @NotBlank
    String descricao;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    LocalDateTime data_requisição;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    LocalDateTime data_apontamento;

}
