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
@Entity(name = "fornecedores")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fornecedor")
    Long id;

    @Valid
    @Size(min = 3)
    @Column(name = "nome_fornecedor")
    String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    Usuario usuario;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "inicio_contrato")
    LocalDateTime inicioContrato;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "fim_contrato")
    LocalDateTime fimContrato;

}