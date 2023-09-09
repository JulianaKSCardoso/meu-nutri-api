package br.com.meu.nutri.domain.planoAlimentar;

import jakarta.persistence.*;

@Entity(name = "ItemRefeicao")
@Table(name = "item_refeicao")
public class ItemRefeicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String alimento;
    private float quantidade;

    @ManyToOne(optional = false)
    private Refeicao refeicao;

}
