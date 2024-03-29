package com.projetoWEG.domain.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "aprovacoes")
public class Aprovacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Valid
    @NotNull
    LocalDateTime data;

    @Valid
    @NotBlank
    @Column(name = "nome_fornecedor")
    String nomeFornecedor;

    @Valid
    @NotBlank
    @Column(name = "nome_responsavel")
    String nomeResponsavel;

    @Valid
    @NotNull
    @JoinColumn(name = "id_consultor")
    @ManyToOne
    Consultor idConsultor;

    @Valid
    @NotNull
    @Column(name = "horas_aprovadas")
    int horasAprovadas;

    @Valid
    @NotNull
    @Column(name = "valor_horas")
    double valorHora;

    @OneToMany
    @JoinColumn(name = "id_apontamento")
    List<Apontamento> apontamentos;

}
