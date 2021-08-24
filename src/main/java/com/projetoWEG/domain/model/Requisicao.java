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
    String nomeConsultor;

    @Valid
    @NotBlank
    String nomeResponsavel;

    @Valid
    @NotBlank
    String descricao;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    LocalDateTime dataRequisicao;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    LocalDateTime dataApontamento;

}
