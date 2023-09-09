package br.com.meu.nutri.domain.usuario;

import br.com.meu.nutri.enums.Genero;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;


@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @JsonFormat(pattern = "dd/MM/yyy")
    private LocalDateTime dtCadastro;
    private String nome;
    private Date dtNascimento;

    @Column(unique = true)
    private String cpf;

    private String telefone;

    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    private String observacao;

    public Usuario(DadosUsuarioDto dados) {
        this.dtCadastro = dados.getDtCadastro();
        this.nome = dados.getNome();
        this.dtNascimento = dados.getDtNascimento();
        this.cpf = dados.getCpf();
        this.telefone = dados.getTelefone();
        this.email = dados.getEmail();
        this.genero = dados.getGenero();
        this.observacao = dados.getObservacao();
    }

    public void atualizarDados(Usuario dados) {
        this.dtCadastro = dados.getDtCadastro();
        this.nome = dados.getNome();
        this.dtNascimento = dados.getDtNascimento();
        this.cpf = dados.getCpf();
        this.telefone = dados.getTelefone();
        this.email = dados.getEmail();
        this.genero = dados.getGenero();
        this.observacao = dados.getObservacao();
    }

}
