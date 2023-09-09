package br.com.meu.nutri.domain.avaliacaoFisica;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medida {

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


    public Medida(DadosMedidasDto dados) {
        this.peso = dados.getPeso();
        this.altura = dados.getAltura();
        this.bracoDireito = dados.getBracoDireito();
        this.bracoEsquerdo = dados.getBracoEsquerdo();
        this.ombros = dados.getOmbros();
        this.peitoral = dados.getPeitoral();
        this.cintura = dados.getCintura();
        this.abdomen = dados.getAbdomen();
        this.quadril = dados.getQuadril();
        this.coxaDireita = dados.getCoxaDireita();
        this.coxaEsquerda = dados.getCoxaEsquerda();
    }
}
