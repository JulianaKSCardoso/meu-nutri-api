package br.com.meu.nutri.domain.paciente;


import br.com.meu.nutri.domain.endereco.DadosEnderecoDto;
import br.com.meu.nutri.domain.usuario.DadosUsuarioDto;
import br.com.meu.nutri.domain.usuario.Usuario;
import br.com.meu.nutri.enums.Genero;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class DadosPacienteDto {

        @NotNull
        private Long id;

        @NotNull
        @Valid
        private DadosUsuarioDto usuario;

        @NotNull
        private boolean ativo;

        @NotNull
        @Valid
        private DadosEnderecoDto endereco;
}
