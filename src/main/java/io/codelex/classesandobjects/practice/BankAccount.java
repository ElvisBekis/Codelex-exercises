package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name = "John";
    public double balance = 20;

    public String toString() {
        String result = name + ", ";
        if (balance < 0) {
            result += "-";
        }
        return result + "$" + String.format("%2.f", balance);
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }
}

