package com.appbank.bank.model;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount() {
        super();
       
    }


    public SavingAccount(String id, Customer owner, Money balance, double interestRate) {
        super(id, owner, balance);
        this.interestRate = interestRate;
    }
    @Override
    public void applyInterest(){
        double newBalance = getBalance().getAmount() + (getBalance().getAmount() * interestRate);
        getBalance().setAmount(newBalance);

    }

        public double getInterestRate() {
        return interestRate;

}

public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}
