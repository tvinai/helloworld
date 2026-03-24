package com.example.helloword;

import com.example.helloword.entity.AccountEntity;
import com.example.helloword.repository.AccountRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    @Transactional
    public void save() {
        AccountEntity accountEntity = AccountEntity.builder()
                .accountRefId(UUID.randomUUID().toString())
                .accountNo("1234567890")
                .accountName("Account #1")
                .createdDatetime(ZonedDateTime.now())
                .updatedDatetime(ZonedDateTime.now())
                .build();
        accountRepository.save(accountEntity);
    }

}
