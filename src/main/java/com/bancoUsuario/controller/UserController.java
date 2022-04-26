package com.bancoUsuario.controller;

import com.bancoUsuario.dto.UserAndAccountResponse;
import com.bancoUsuario.dto.UserRequest;
import com.bancoUsuario.dto.UserResponse;

import com.bancoUsuario.services.GetUserService;
import com.bancoUsuario.services.RegisterUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final RegisterUserService registerUserService;
    private final GetUserService getUserService;

    @PostMapping("/new")
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserResponse registerUser(@RequestBody UserRequest userRequest){
        return registerUserService.create(userRequest);
    }

    @GetMapping("/{id}")
    public UserResponse findUserById(@PathVariable Integer id){
        return getUserService.getById(id);
    }

    @GetMapping("/account")
    public UserAndAccountResponse getUserAndAccount(@RequestParam Integer userId, @RequestParam Integer accountId){
        return getUserService.getUserAndAccount(userId, accountId);
    }
}
