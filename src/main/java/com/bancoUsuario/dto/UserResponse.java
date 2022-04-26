package com.bancoUsuario.dto;

import com.bancoUsuario.entities.User;
import lombok.Setter;

@Setter
public class UserResponse {

    private Integer id;
    private String name;

    public static UserResponse toResponse(User user) {
        UserResponse response = new UserResponse();

        response.setId(user.getId());
        response.setName(user.getName());

        return response;
    }
}
