package com.bancoUsuario.dto.clients;

import lombok.Data;


import java.math.BigDecimal;

@Data
public class AccountInfo {
    private Integer id;
    private Integer number;
    private Integer agency;
    private AccountType accountType;
    private BigDecimal balance;
    private Integer userId;
}
