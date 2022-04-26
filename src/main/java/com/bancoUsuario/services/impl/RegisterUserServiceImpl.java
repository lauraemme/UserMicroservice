package com.bancoUsuario.services.impl;

import com.bancoUsuario.dto.UserRequest;
import com.bancoUsuario.dto.UserResponse;
import com.bancoUsuario.entities.User;
import com.bancoUsuario.repository.UserRepository;
import com.bancoUsuario.services.RegisterUserService;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {

    private UserRepository userRepository;

    public UserResponse create(UserRequest userRequest) {
        User user = new User(userRequest);
        userRepository.save(user);

        return UserResponse.toResponse(user);
    }
}
