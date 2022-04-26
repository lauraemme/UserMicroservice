package com.bancoUsuario.services;

import com.bancoUsuario.dto.UserAndAccountResponse;
import com.bancoUsuario.dto.UserResponse;

public interface GetUserService {

    UserResponse getById(Integer id);

    UserAndAccountResponse getUserAndAccount(Integer userId, Integer accountId);
}
