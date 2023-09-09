package br.com.meu.nutri.domain.paciente;

import br.com.meu.nutri.domain.endereco.Endereco;
import br.com.meu.nutri.domain.usuario.Usuario;
import br.com.meu.nutri.enums.Genero;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "Paciente")
@Table(name="pacientes")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of="id")
public class Paciente {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;

        @Embedded
        Usuario usuario;

        private boolean ativo;

        @Embedded
        private Endereco endereco;

        public Paciente(DadosPacienteDto dados) {
                this.usuario = new Usuario(dados.getUsuario());
                this.endereco = new Endereco(dados.getEndereco());
        }

        public void  atualizaDados(Paciente dados) {
                this.usuario.atualizarDados(dados.getUsuario());
                this.endereco.atualizarDados(dados.getEndereco());
        }

}

