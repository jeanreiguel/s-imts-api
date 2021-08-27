package com.projetoWEG.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "aprovacoes")
public class Aprovacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Valid
    @NotNull
    private Date data;

    @Valid
    @NotBlank
    @Column(name = "nome_fornecedor")
    private String nomeFornecedor;

    @Valid
    @NotBlank
    @Column(name = "nome_responsavel")
    private String nomeResponsavel;

    @Valid
    @NotNull
    @Column(name = "horas_aprovadas")
    private int horasAprovadas;

    @Valid
    @NotNull
    @Column(name = "valor_horas")
    private double valorHora;

    @OneToMany
    @JoinColumn(name = "id_apontamento")
    private List<Apontamento> apontamentos;

}
