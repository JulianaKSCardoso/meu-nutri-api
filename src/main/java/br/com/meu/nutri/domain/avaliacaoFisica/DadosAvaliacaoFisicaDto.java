package br.com.meu.nutri.domain.avaliacaoFisica;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosAvaliacaoFisicaDto {

    private Long id;
    private Date dataAvaliacao;
    private DadosMedidasDto medidas;
    private String observacao;


}
