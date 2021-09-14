package com.projetoWEG.domain.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "requisicoes")
public class Requisicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "requisicao_id")
    Long id;

    @Valid
    @JoinColumn(name = "requisicao_id_consultor")
    @ManyToOne
    Consultor idConsultor;

    @Valid
    @NotBlank
    String nomeResponsavel;

    @Valid
    @NotBlank
    String descricao;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    LocalDateTime dataRequisicao;

}
