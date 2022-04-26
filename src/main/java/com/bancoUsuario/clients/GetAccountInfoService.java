package com.bancoUsuario.clients;

import com.bancoUsuario.dto.clients.AccountInfo;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetAccountInfoService {

    public AccountInfo execute(Integer id){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<AccountInfo> userInfoResponseEntity = restTemplate.exchange(
                "http://localhost:8080/account/{id}",
                HttpMethod.GET,
                entity,
                AccountInfo.class,
                id
        );

        return userInfoResponseEntity.getBody();
    }
}
