package br.com.meu.nutri.domain.avaliacaoFisica;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "avaliacaoFisica")
@Table(name = "avaliacao_fisica")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pacienteId;

    private LocalDateTime dataAvaliacao;

    @Embedded
    private Medida medidas;

    private String observacao;

    public AvaliacaoFisica(DadosAvaliacaoFisicaDto dados) {
        this.pacienteId = dados.getPacienteId();
        this.dataAvaliacao = dados.getDataAvaliacao();
        this.medidas = new Medida(dados.getMedidas());
        this.observacao = dados.getObservacao();
    }
}
