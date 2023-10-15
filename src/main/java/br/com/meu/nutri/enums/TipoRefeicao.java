package br.com.meu.nutri.enums;

import lombok.Getter;

@Getter
public enum TipoRefeicao {

    CAFE_DA_MANHA("Café da Manhã"),
    LANCHE_DA_MANHA("Lanche da Manhã"),
    ALMOCO("Almoço"),
    LANCHE_DA_TARDE("Lanche da Tarde"),
    JANTAR("Jantar"),
    CEIA("Ceia");

    public final String descricao;

    TipoRefeicao(String descricao){
        this.descricao = descricao;
    }
}
