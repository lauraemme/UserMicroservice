package com.bancoUsuario.services;

import com.bancoUsuario.dto.UserRequest;
import com.bancoUsuario.dto.UserResponse;

public interface RegisterUserService  {

    UserResponse create(UserRequest userRequest);
}
