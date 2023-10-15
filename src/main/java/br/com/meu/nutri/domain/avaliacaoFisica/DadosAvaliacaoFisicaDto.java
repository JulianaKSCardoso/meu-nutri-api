package br.com.meu.nutri.domain.avaliacaoFisica;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosAvaliacaoFisicaDto {

    @NotNull
    private Long id;

    @NotNull
    private Long pacienteId;


    private LocalDateTime dataAvaliacao;

    @NotNull
    @Valid
    private DadosMedidasDto medidas;

    private String observacao;

}
