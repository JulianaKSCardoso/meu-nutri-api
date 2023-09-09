package br.com.meu.nutri.domain.planoAlimentar;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "plano_alimentar")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanoAlimentar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "planoAlimentar")
    private List<Refeicao> refeicoes = new ArrayList<>();

    private String observacao;

    @NotNull
    @Column(name = "paciente_id")
    private Long pacienteId;

    @NotNull
    @Column(name = "nutricionista_id")
    private Long nutricionistaId;

}
