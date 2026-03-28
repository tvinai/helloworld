package com.example.helloword.service;

import com.example.helloword.entity.AccountEntity;
import com.example.helloword.mapper.GetAccountResponseMapper;
import com.example.helloword.model.request.GetAccountResponse;
import com.example.helloword.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GetAccountService {

    private final AccountRepository accountRepository;

    public GetAccountResponse getAccount(String accountNo) {

        AccountEntity accountEntity = accountRepository.findByAccountNo(accountNo)
                .orElse(null);

        return GetAccountResponseMapper.from(accountEntity);
    }

}
