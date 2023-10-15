package br.com.meu.nutri.domain.usuario;

import lombok.Getter;

@Getter
public enum UserRoles {

    ADMIN("admin"),
    PACIENTE("paciente"),
    NUTRICIONISTA("nutricionista");

    public String role;

    UserRoles(String role) {
        this.role = role;
    }

}
