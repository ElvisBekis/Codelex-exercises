package io.codelex.test.exercise1;

import java.math.BigDecimal;

public abstract class Card {

    private final int number;
    private final String firstName;
    private final String lastName;
    private final String CCV;
    BigDecimal balance;

    public Card(int number, String firstName, String lastName, String CCV, BigDecimal balance) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.CCV = CCV;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getCCV() {
        return CCV;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public abstract void addMoney(BigDecimal money);

    public abstract void takeMoney(BigDecimal money) throws NotEnoughFundsException;
}
