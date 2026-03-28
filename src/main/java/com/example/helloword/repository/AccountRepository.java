package com.example.helloword.repository;

import com.example.helloword.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<AccountEntity, String> {

    Optional<AccountEntity> findByAccountNo(String accountNo);
}
