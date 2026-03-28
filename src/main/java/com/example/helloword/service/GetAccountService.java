package com.example.helloword.service;

import com.example.helloword.model.request.GetAccountResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GetAccountService {

    public GetAccountResponse getAccount(String accountNo) {
        return new GetAccountResponse();
    }

}
