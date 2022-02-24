package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the first integer number: ");
        int x = input.nextInt();
        System.out.print("Input the second integer number: ");
        int y = input.nextInt();
        System.out.print("The result is " + calculate(x, y));
        System.out.print("\n");

    }

    public static boolean calculate(int a, int b) {
        if (a == 15 || b == 15) {
            return true;

        }
        return ((a + b) == 15 || Math.abs(a - b) == 15);
    }
}
