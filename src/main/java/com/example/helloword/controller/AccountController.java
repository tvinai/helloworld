package com.example.helloword.controller;

import com.example.helloword.model.request.GetAccountResponse;
import com.example.helloword.service.GetAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/account")
@RequiredArgsConstructor
public class AccountController {

    private final GetAccountService getAccountService;

    @GetMapping("/{accountNo}")
    public GetAccountResponse getAccount(@PathVariable String accountNo) {
        return getAccountService.getAccount(accountNo);
    }
}
