package br.com.meu.nutri.domain.endereco;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String complemento;

    public Endereco(DadosEnderecoDto dados) {
        this.logradouro = dados.getLogradouro();
        this.numero = dados.getNumero();
        this.bairro = dados.getBairro();
        this.cidade = dados.getCidade();
        this.uf = dados.getUf();
        this.cep = dados.getCep();
        this.complemento = dados.getComplemento();
    }

    public void atualizarDados(@NotNull Endereco dados) {
        this.logradouro = dados.getLogradouro();
        this.numero = dados.getNumero();
        this.bairro = dados.getBairro();
        this.cidade = dados.getCidade();
        this.uf = dados.getUf();
        this.cep = dados.getCep();
        this.complemento = dados.getComplemento();
    }

}
