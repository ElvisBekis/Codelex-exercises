package io.codelex.classesandobjects.practice.exercises;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex8Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int months;
        BigDecimal startingBalance;
        BigDecimal rate;
        BigDecimal totalDeposit = BigDecimal.valueOf(0);
        BigDecimal totalWithdraw = BigDecimal.valueOf(0);
        BigDecimal monthlyDeposit;
        BigDecimal monthlyWithdraw;
        BigDecimal interestEarned = BigDecimal.valueOf(0);


        System.out.print("Hom much money is in the account?: ");
        startingBalance = input.nextBigDecimal();
        Ex8SavingsAccount balance = new Ex8SavingsAccount(startingBalance);
        System.out.print("Enter the annual interest rate: ");
        rate = input.nextBigDecimal();
        balance.setANNUAL_INTEREST_RATE(rate);
        System.out.print("How long has the account been opened?: ");
        months = input.nextInt();

        for (int i = 1; i <= months; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            monthlyDeposit = input.nextBigDecimal();
            balance.deposit(monthlyDeposit);
            totalDeposit = totalDeposit.add(monthlyDeposit);
            System.out.print("Enter amount withdrawn for month " + i + ": ");
            monthlyWithdraw = input.nextBigDecimal();
            balance.withdraw(monthlyWithdraw);
            totalWithdraw = totalWithdraw.add(monthlyWithdraw);
            balance.interest();
            interestEarned = interestEarned.add(balance.getINTEREST_EARNED());
        }

        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        System.out.println("Totat deposited: " + dollar.format(totalDeposit));
        System.out.println("Total withdrawn: " + dollar.format(totalWithdraw));
        System.out.println("Interest earned: " + dollar.format(interestEarned));
        System.out.println("Ending balance: " + dollar.format(balance.getBalance()));


    }
}
