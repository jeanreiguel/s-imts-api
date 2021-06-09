package com.projetoWEG.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Consultor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Valid
    @NotBlank
    @Size(min = 3)
    String nome;

    @Valid
    @Email
    @Size(min = 5)
    String email;

    @Valid
    @NotBlank
    @Size(min = 14)
    String telefone;

    @Valid
    @NotBlank
    String skill;

    @Valid
    @NotNull
    @Size(min = 1, max = 4)
    String limite_horas;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    StatusConsultor Status;
}