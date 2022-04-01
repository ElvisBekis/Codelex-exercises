package io.codelex.test.exercise1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard creditCard = new CreditCard(1234555, "Elvis", "Bēķis", "123",
                BigDecimal.valueOf(0));
        DebitCard debitCard = new DebitCard(1234555, "Elvis", "Bēķis", "123",
                BigDecimal.valueOf(0));
        //creditCard.addMoney(BigDecimal.valueOf(200));
        //System.out.println(creditCard.getFullName());
        //System.out.println(creditCard.getCCV());
        // System.out.println(creditCard.getBalance());
        //creditCard.takeMoney(BigDecimal.valueOf(80));
        // creditCard.takeMoney(BigDecimal.valueOf(100));
        //creditCard.takeMoney(BigDecimal.valueOf(50));
        //System.out.println(creditCard.getBalance());
        //debitCard.addMoney(BigDecimal.valueOf(11111));
        //debitCard.takeMoney(BigDecimal.valueOf(10000));
        //System.out.println(debitCard.getBalance());
    }
}
