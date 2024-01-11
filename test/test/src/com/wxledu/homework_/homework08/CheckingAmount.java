package com.wxledu.homework_.homework08;

public class CheckingAmount extends BankAccount{
    public CheckingAmount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount-1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
