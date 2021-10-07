package com.projetoWEG.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "fornecedor_responsaveis")
public class Responsavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_responsavel")
    Long id;

    @Valid
    @NotNull
    @Column(name = "id_fornecedor")
    Long idFornecedor;

    @Valid
    @NotBlank
    @Column(name = "nome_responsavel")
    String nomeResponsavel;

    @ManyToMany
    @JoinTable(name = "alocacao_fornecedor",
            joinColumns = @JoinColumn(name = "id_fornecedor",referencedColumnName = "id_fornecedor"),
            inverseJoinColumns = @JoinColumn(name = "id_projeto",referencedColumnName = "id_projeto"))
    List<Projeto> projetos;
}
