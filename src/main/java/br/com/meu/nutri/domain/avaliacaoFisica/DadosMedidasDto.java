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

    public DadosMedidasDto(Medida medidas) {
        this.peso = medidas.getPeso();
        this.altura = medidas.getAltura();
        this.bracoDireito = medidas.getBracoDireito();
        this.bracoEsquerdo = medidas.getBracoEsquerdo();
        this.ombros = medidas.getOmbros();
        this.peitoral = medidas.getPeitoral();
        this.cintura = medidas.getCintura();
        this.abdomen = medidas.getAbdomen();
        this.quadril = medidas.getQuadril();
        this.coxaDireita = medidas.getCoxaDireita();
        this.coxaEsquerda = medidas.getCoxaEsquerda();
    }
}
