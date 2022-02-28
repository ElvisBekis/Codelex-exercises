package io.codelex.loops.excercises;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word:");
        String first = input.next();
        System.out.println("Enter second word:");
        String second = input.next();

        String bothWords = first + second;
        int totalChar = bothWords.length();
        int difference = 0;

        if (totalChar <= 30) {
            difference = 30 - totalChar;
        }
        String dots = "";
        for (int i = 0; i <= difference; i++) {
            dots += ".";

        }
        System.out.println(first + dots + second);
    }
}
