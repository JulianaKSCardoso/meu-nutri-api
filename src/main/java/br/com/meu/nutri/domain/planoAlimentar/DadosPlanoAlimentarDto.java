package br.com.meu.nutri.domain.planoAlimentar;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosPlanoAlimentarDto {

    private Long id;

    private List<Refeicao> refeicoes = new ArrayList<>();

    private String observacao;

    private Long pacienteId;

    private Long nutricionistaId;
}
