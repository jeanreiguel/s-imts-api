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
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "consultores")
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    Usuario usuario;

    @Valid
    @NotBlank
    @Column(name = "skill_consultor")
    String skill;

    @Valid
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "limite_horas")
    String limiteHoras;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String status;

    @ManyToMany
    @JoinTable(name = "consultor_alocacao",
            joinColumns = @JoinColumn(name = "id_consultor",referencedColumnName = "cadastro_consultor"),
            inverseJoinColumns = @JoinColumn(name = "id_projeto",referencedColumnName = "id_projeto"))
    List<Projeto> projetos;

    @ManyToMany
    @JoinTable(name = "apontamentos",
            joinColumns = @JoinColumn(name = "alocacao_id_consultor",referencedColumnName = "cadastro_consultor"),
            inverseJoinColumns = @JoinColumn(name = "id_apontamento",referencedColumnName = "id_apontamento"))
    List<Apontamento> apontamentos;
}