package io.codelex.loops.excercises;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 20 == 0) {
                System.out.print("FizzBuzz " + "\n");
            } else if (i % 20 == 0) {
                System.out.print("Buzz " + "\n");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}