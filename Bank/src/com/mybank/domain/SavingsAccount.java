package com.mybank.domain;

//interestRate - процентная ставка

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double initBalance,double interestRate) {
        super(initBalance);
        interestRate = interestRate;
    }
}
