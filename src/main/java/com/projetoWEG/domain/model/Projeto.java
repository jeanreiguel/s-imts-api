package com.projetoWEG.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetoWEG.domain.exception.CasoException;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "projetos")
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
   @JoinColumn(name = "secao_projeto")
   @ManyToOne
   Secao secao;

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

   @ManyToMany
   @JoinTable(name = "consultor_alocacao",
           joinColumns = @JoinColumn(name = "id_projeto",referencedColumnName = "id_projeto"),
           inverseJoinColumns = @JoinColumn(name = "id_consultor",referencedColumnName = "cadastro_consultor"))
   List<Consultor> consultores;

   @ManyToMany
   @JoinTable(name = "apontamentos",
           joinColumns = @JoinColumn(name = "alocacao_id_projeto",referencedColumnName = "id_projeto"),
           inverseJoinColumns = @JoinColumn(name = "id_apontamento",referencedColumnName = "id_apontamento"))
   List<Apontamento> apontamentos;

   @ManyToMany
   @JoinTable(name = "skills",
           joinColumns = @JoinColumn(name = "id_projeto",referencedColumnName = "id_projeto"),
           inverseJoinColumns = @JoinColumn(name = "skill_id",referencedColumnName = "skill_id"))
   List<Skill> skills;

   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
   @Enumerated(EnumType.STRING)
   @Column(name = "status_projeto")
   StatusProjeto status;

   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
   Date dataInicio;

   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
   Date dataFim;

   @JsonProperty(access = JsonProperty.Access.READ_ONLY)
   @Column(name = "horas_apontadas")
   int horasApontadas;

   @Valid
   @NotNull
   @Column(name = "horas_total")
   int horasTotal;


   public Skill adicionarSkill(Skill skill) {
      this.skills.add(skill);

      return skill;
   }

   public void atualizarHoras(Apontamento apontamento) {

      if(this.horasTotal > this.getHorasApontadas() ) {
         if (apontamento.getSituacaoApontamento() == "APROVADO") {
            this.setHorasApontadas(this.getHorasApontadas() + apontamento.getHorasTrabalhadas());

            this.getSkills().forEach(
                 skill -> {
                    if (apontamento.getAlocacao().getSkill().equals(skill.getNome())) {
                       skill.setHorasApontadas(skill.getHorasApontadas() + apontamento.getHorasTrabalhadas());
                    } else {
                       throw new CasoException("Horas trabalhadas superior ao limite");
                    }
                 }
            );
         }
      }
   }
}
