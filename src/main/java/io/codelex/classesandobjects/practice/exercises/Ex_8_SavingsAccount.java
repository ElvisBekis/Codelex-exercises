package io.codelex.classesandobjects.practice.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex_8_SavingsAccount {

    BigDecimal balance;
    BigDecimal ANNUAL_INTEREST_RATE;
    BigDecimal INTEREST_EARNED;

    public void setANNUAL_INTEREST_RATE(BigDecimal ANNUAL_INTEREST_RATE) {
        this.ANNUAL_INTEREST_RATE = ANNUAL_INTEREST_RATE;
    }

    public Ex_8_SavingsAccount(BigDecimal startingBalance) {
        balance = startingBalance;
    }

    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) > 0) {
            balance = balance.subtract(amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void interest() {
        INTEREST_EARNED = balance.multiply(ANNUAL_INTEREST_RATE.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP));
        balance = balance.add(INTEREST_EARNED);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getINTEREST_EARNED() {
        return INTEREST_EARNED;
    }

    public void setINTEREST_EARNED(BigDecimal INTEREST_EARNED) {
        this.INTEREST_EARNED = INTEREST_EARNED;
    }
}
