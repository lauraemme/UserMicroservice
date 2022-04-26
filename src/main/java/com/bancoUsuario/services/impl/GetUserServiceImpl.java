package com.bancoUsuario.services.impl;

import com.bancoUsuario.clients.GetAccountInfoService;
import com.bancoUsuario.dto.UserAndAccountResponse;
import com.bancoUsuario.dto.UserResponse;
import com.bancoUsuario.dto.clients.AccountInfo;
import com.bancoUsuario.entities.User;
import com.bancoUsuario.repository.UserRepository;
import com.bancoUsuario.services.GetUserService;
import org.springframework.stereotype.Service;

@Service
public class GetUserServiceImpl implements GetUserService {

    private UserRepository userRepository;
    private GetAccountInfoService getAccountInfoService;

    @Override
    public UserResponse getById(Integer id) {
        return UserResponse.toResponse(userRepository.getById(id));
    }

    @Override
    public UserAndAccountResponse getUserAndAccount(Integer userId, Integer accountId) {
        AccountInfo accountInfo = getAccountInfoService.execute(accountId);
        User user = userRepository.getById(userId);

        if(accountInfo.getUserId() == userId){
            return UserAndAccountResponse.toResponse(user, accountInfo);
        }
        return null;
    }
}
