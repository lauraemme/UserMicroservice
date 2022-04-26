package com.bancoUsuario.dto;

import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class UserRequest {
    private String cpf;
    private String name;
    private String passaword;
}
