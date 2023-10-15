package br.com.meu.nutri.domain.login;

import br.com.meu.nutri.domain.usuario.UserRoles;

public record RegistroDto(String email, String senha, UserRoles role){

}
