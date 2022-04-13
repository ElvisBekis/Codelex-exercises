package io.codelex.test.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(int number, String firstName, String lastName, String CCV, BigDecimal balance) {
        super(number, firstName, lastName, CCV, balance);
    }

    @Override
    public void addMoney(BigDecimal money) {
        this.balance = balance.add(money);
        BigDecimal limit = BigDecimal.valueOf(10000);
        if (getBalance().compareTo(limit) > 0) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void takeMoney(BigDecimal money) throws NotEnoughFundsException {
        this.balance = balance.subtract(money);
        if (getBalance().compareTo(BigDecimal.valueOf(0)) < 0) {
            throw new NotEnoughFundsException("Not enough money!!!");
        }

    }
}
