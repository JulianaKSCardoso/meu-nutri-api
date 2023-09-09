package br.com.meu.nutri.domain.usuario;
import br.com.meu.nutri.enums.Genero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosUsuarioDto {

    private LocalDateTime dtCadastro;
    private String nome;
    private Date dtNascimento;
    private String cpf;
    private String telefone;
    private String email;
    private Genero genero;
    private String observacao;

}
