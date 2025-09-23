package com.appbank.bank.model;

import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Transaction;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(String id, Customer owner, Money balance, double overdraftLimit) {
        super(id, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void applyInterest(){

    }

    public boolean withdraw(Money amount){
        double newBalance = getBalance().getAmount() + overdraftLimit;
        if (newBalance >= amount.getAmount()) {
            getBalance().setAmount(getBalance().getAmount() - amount.getAmount());
            getTransactions().add(new Transaction("WDR", amount, getId()));
            
            return true;
        }
        return false;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
