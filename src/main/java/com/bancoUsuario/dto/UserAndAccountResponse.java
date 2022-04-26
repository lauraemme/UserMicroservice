package com.bancoUsuario.dto;

import com.bancoUsuario.dto.clients.AccountInfo;
import com.bancoUsuario.dto.clients.AccountType;
import com.bancoUsuario.entities.User;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@NoArgsConstructor
public class UserAndAccountResponse {
    private String name;
    private String cpf;
    private Integer accountId;
    private Integer number;
    private Integer agency;
    private AccountType accountType;
    private BigDecimal balance;

    public static UserAndAccountResponse toResponse (User user, AccountInfo accountInfo){
        UserAndAccountResponse response = new UserAndAccountResponse();

        response.setName(user.getName());
        response.setCpf(user.getCpf());
        response.setAccountId(accountInfo.getId());
        response.setNumber(accountInfo.getNumber());
        response.setAgency(accountInfo.getAgency());
        response.setAccountType(accountInfo.getAccountType());
        response.setBalance(accountInfo.getBalance());

        return response;
    }
}
