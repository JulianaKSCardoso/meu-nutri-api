package br.com.meu.nutri.domain.avaliacaoFisica;

import br.com.meu.nutri.domain.paciente.Paciente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "avaliacaofisica")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pacienteId;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataAvaliacao;

    @Embedded
    private Medida medidas;

    private String observacao;

    public AvaliacaoFisica(DadosAvaliacaoFisicaDto dados) {
         this.dataAvaliacao = dados.getDataAvaliacao();
         this.medidas = new Medida(dados.getMedidas());
         this.observacao = dados.getObservacao();
    }
}
