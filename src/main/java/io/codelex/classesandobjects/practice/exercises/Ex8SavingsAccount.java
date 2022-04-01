package io.codelex.classesandobjects.practice.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex8SavingsAccount {

    BigDecimal balance;
    BigDecimal annualInterestRate;
    BigDecimal interestEarned;

    public void setANNUAL_INTEREST_RATE(BigDecimal ANNUAL_INTEREST_RATE) {
        this.annualInterestRate = ANNUAL_INTEREST_RATE;
    }

    public Ex8SavingsAccount(BigDecimal startingBalance) {
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
        interestEarned = balance.multiply(annualInterestRate.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP));
        balance = balance.add(interestEarned);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getINTEREST_EARNED() {
        return interestEarned;
    }

    public void setINTEREST_EARNED(BigDecimal INTEREST_EARNED) {
        this.interestEarned = INTEREST_EARNED;
    }
}
