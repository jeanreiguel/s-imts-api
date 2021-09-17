package com.projetoWEG.domain.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "secoes")
public class Secao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "secao_id")
    Long idSecao;

    @Valid
    @NotBlank
    @Size(max = 255)
    @Column(name = "secao_nome")
    String nomeSecao;
}
