package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {

        long nr;
        int sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        nr = sc.nextLong();
        for (sum = 0; nr != 0; nr /= 10) {
            sum += nr % 10;
        }
        System.out.println("Sum of digits of a number is " + sum);
    }
}
