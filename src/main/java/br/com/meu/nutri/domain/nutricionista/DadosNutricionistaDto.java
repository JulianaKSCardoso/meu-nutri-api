package br.com.meu.nutri.domain.nutricionista;

import br.com.meu.nutri.domain.endereco.DadosEnderecoDto;
import br.com.meu.nutri.domain.usuario.DadosUsuarioDto;
import br.com.meu.nutri.domain.usuario.Usuario;
import br.com.meu.nutri.enums.Genero;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DadosNutricionistaDto {

    private Long id;
    private DadosUsuarioDto usuario;

    @NotNull
    @Valid
    private DadosEnderecoDto endereco;

}
