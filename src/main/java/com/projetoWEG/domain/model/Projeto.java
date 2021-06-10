package com.projetoWEG.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "projetos")
public class Projeto {

   @Valid
   @NotNull
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_projeto")
   Long id;

   @Valid
   @NotBlank
   @Size(max = 255)
   @Column(name = "secao_projeto")
   String secao;

   @Valid
   @NotBlank
   @Size(max = 100)
   @Column(name = "nome_projeto")
   String nome;

   @Valid
   @NotBlank
   @Size(max = 255)
   @Column(name = "descricao_projeto")
   String descricao;

   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
   @Enumerated(EnumType.STRING)
   @Column(name = "status_projeto")
   StatusProjeto status;

   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
   LocalDateTime data_inicio;

   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
   LocalDateTime data_fim;

   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
   int horas_apontadas;

   @Valid
   @NotNull
   int horas_total;

}
