package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-zero integer number: ");
        int number = input.nextInt();
        System.out.println(isHappyNumber(number) ? "It is a happy Number" : "It is not a happy Number");
    }

    public static boolean isHappyNumber(int number) {
        Set<Integer> digits = new HashSet<>();
        while (digits.add(number)) {
            int result = 0;
            while (number > 0) {
                result += Math.pow(number % 10, 2);
                number = number / 10;
            }
            number = result;
        }
        return number == 1;
    }
}
