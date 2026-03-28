package com.example.helloword.mapper;

import com.example.helloword.entity.AccountEntity;
import com.example.helloword.model.request.GetAccountResponse;

public class GetAccountResponseMapper {

    private GetAccountResponseMapper() {

    }

    public static GetAccountResponse from(AccountEntity accountEntity) {
        if (accountEntity == null) {
            return new GetAccountResponse();
        }

        return GetAccountResponse.builder()
                .accountNo(accountEntity.getAccountNo())
                .accountName(accountEntity.getAccountName())
                .build();
    }
}
