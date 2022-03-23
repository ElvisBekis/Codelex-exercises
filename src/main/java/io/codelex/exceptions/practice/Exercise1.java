package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator");
            String numerator = scanner.nextLine();
            if (numerator.charAt(0) == 'Q' || numerator.charAt(0) == 'q') {
                break;
            } else if (!numerator.matches("[0-9]+")) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                continue;
            }
            System.out.println("Enter the divisor");
            String divisor = scanner.nextLine();
            if (!divisor.matches("[0-9]+")) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                continue;
            } else if (Integer.parseInt(divisor) == 0) {
                System.out.println("You can't divide by 0.");
                System.out.println("Please try again.");
                continue;
            }
            System.out.println(numerator + " / " + divisor + " = " + Integer.parseInt(numerator) / Integer.parseInt(divisor));
        }
    }
}
