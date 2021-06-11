package com.projetoWEG.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "consultores")
@Embeddable
public class Consultor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cadastro_consultor")
    Long id;

    @Valid
    @NotBlank
    @Size(min = 3)
    @Column(name = "nome_consultor")
    String nome;

    @Valid
    @Email
    @Size(min = 5)
    @Column(name = "email_consultor")
    String email;

    @Valid
    @NotBlank
    @Size(min = 14)
    @Column(name = "telefone_consultor")
    String telefone;

    @Valid
    @NotBlank
    @Column(name = "skill_consultor")
    String skill;

    @Valid
    @NotNull
    @Size(min = 1, max = 4)
    String limite_horas;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String status;
}