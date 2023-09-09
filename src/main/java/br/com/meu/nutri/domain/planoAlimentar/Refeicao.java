package br.com.meu.nutri.domain.planoAlimentar;

import br.com.meu.nutri.enums.TipoRefeicao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity(name = "Refeicao")
@Table(name = "refeicao")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Refeicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private PlanoAlimentar planoAlimentar;

    @Enumerated(EnumType.STRING)
    private TipoRefeicao tipoRefeicao;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "refeicao")
    private List<ItemRefeicao> itensRefeicao = new ArrayList<>();



}

