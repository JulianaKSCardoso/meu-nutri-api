package br.com.meu.nutri.domain.nutricionista;

import br.com.meu.nutri.domain.usuario.Usuario;
import br.com.meu.nutri.domain.endereco.Endereco;
import br.com.meu.nutri.enums.Genero;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity(name = "Nutricionista")
@Table(name = "nutricionista")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Nutricionista {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Usuario usuario;

    @Embedded
    private Endereco endereco;

    public Nutricionista(DadosNutricionistaDto dados) {
        this.usuario = new Usuario(dados.getUsuario());
        this.endereco = new Endereco(dados.getEndereco());
    }

    public void atualizar(DadosNutricionistaDto nutricionista) {
        this.usuario = new Usuario(nutricionista.getUsuario());
        this.endereco = new Endereco(nutricionista.getEndereco());
    }
}
