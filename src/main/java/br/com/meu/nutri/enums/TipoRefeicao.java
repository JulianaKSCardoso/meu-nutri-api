package br.com.meu.nutri.enums;

import lombok.Getter;

@Getter
public enum TipoRefeicao {

    CAFEDAMANHA("Café da Manhã"),
    LANCHEDAMANHA("Lanche da Manhã"),
    ALMOCO("Almoço"),
    LANCHEDATARDE("Lanche da Tarde"),
    JANTAR("Jantar"),
    CEIA("Ceia");

    public final String descricao;

    TipoRefeicao(String descricao){
        this.descricao = descricao;
    }
}
