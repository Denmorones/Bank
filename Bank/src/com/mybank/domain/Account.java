package com.mybank.domain;

public class Account {
    
    protected double balance;
    
    protected Account(double initBalance) {
        balance = initBalance;
    }
    
    public double getBalance() { //проверка баланса
        return balance;
    }
    
    public boolean deposit(double amt) { //депозит
        balance = balance + amt;
        return true;
    }
    
    public boolean withdraw(double amt) { //извлечение
        boolean result = false;  // �� ��������� �������� �� ���������
        if ( amt <= balance ) {
            balance = balance - amt;
            result = true;  // �������� ������� ���������
        }
        return result;
    }
}
