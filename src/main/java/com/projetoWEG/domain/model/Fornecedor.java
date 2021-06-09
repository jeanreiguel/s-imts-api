package com.projetoWEG.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Valid
    @Size(min = 3)
    String nome;

    @Valid
    @Email
    @Size(min = 5)
    String email;

    @Valid
    @Size(min = 14)
    String telefone;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    LocalDateTime inicio_contrato;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    LocalDateTime fim_contrato;

}