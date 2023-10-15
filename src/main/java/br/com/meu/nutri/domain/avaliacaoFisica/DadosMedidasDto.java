package br.com.meu.nutri.domain.avaliacaoFisica;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosMedidasDto {

    private float peso;
    private float altura;
    private float bracoDireito;
    private float bracoEsquerdo;
    private float ombros;
    private float peitoral;
    private float cintura;
    private float abdomen;
    private float quadril;
    private float coxaDireita;
    private float coxaEsquerda;

}
