package com.appbank.bank.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

public class Transaction {
    private String type;
    private Money amount;
    private String accountId;
    private LocalDateTime timestamp;

    public Transaction(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Transaction(String type, Money amount, String accountId) {
        this.type = type;
        this.amount = amount;
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

}
