package com.mybank.domain;

public class CheckingAccount extends Account{
    private double overdraftAmount;

    public CheckingAccount(double initBalance, double overdraft) {
        super(initBalance);
        overdraftAmount = overdraft;
    }

    public CheckingAccount(double initBalance){
        super(initBalance);
        overdraftAmount = 0.0;
    }

    public boolean withdraw(double amt) {
        double overdraft;
        if (balance < amt) {
            overdraft = amt - balance;
            if(overdraftAmount < overdraft) {
                return false;
            } else {
                balance = 0.0;
                overdraftAmount = overdraftAmount - overdraft;
            }
        } else balance = balance - amt;
        return true;
    }
}
