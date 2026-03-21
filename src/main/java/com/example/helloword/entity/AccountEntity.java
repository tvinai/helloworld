package com.example.helloword.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "account")
public class AccountEntity {

    @Id
    private String accountRefId;
    private String accountNo;
    private String accountName;
    private ZonedDateTime createdDatetime;
    private ZonedDateTime updatedDatetime;
}
