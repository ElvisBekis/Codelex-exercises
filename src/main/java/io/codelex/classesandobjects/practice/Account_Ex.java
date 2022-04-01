package io.codelex.classesandobjects.practice;

public class Account_Ex {

    public static void main(String[] args) {

        firstAccount();
        firstTransfer();

        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);

        transfer(A, B, 50);
        transfer(B, C, 25);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }
    public static void firstAccount() {
        Account acc = new Account("", 100);
        acc.deposit(20);
        System.out.println(acc);
    }

    public static void firstTransfer() {
        Account acc = new Account("Matt's account", 1000);
        Account acc2 = new Account("My account", 0);
        acc.withdrawal(100);
        acc2.deposit(100);
        System.out.println(acc);
        System.out.println(acc2);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
