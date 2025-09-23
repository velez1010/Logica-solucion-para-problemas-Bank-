package com.appbank.bank.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Transaction;

public abstract class Account {

    private String id;
    private Customer owner;
    private Money balance;
    private List<Transaction> transactions;

    public Account(){
        this.transactions = new ArrayList<>();
        this.balance = new Money(0.0, "COP");
    }

    public Account(String id, Customer owner, Money balance){
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    //Metodos abstractos
    public abstract void applyInterest();

    public void deposit(Money amount){
        balance.setAmount(balance.getAmount() + amount.getAmount());
        transactions.add(new Transaction("DEPOSITO", amount, this.id));
    }

    public boolean withdraw(Money amount){
        if (balance.getAmount() >= amount.getAmount()) {
            balance.setAmount(balance.getAmount() - amount.getAmount());
            transactions.add(new Transaction("WDR", amount, this.id));
            return true;

           
        }

    }

    //Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    //Getters and Setters

}
