package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int year = minutes / 525600;  //525600 - minutes in 1 year
        int remainingMinutes = minutes % 525600;
        int day = remainingMinutes / 1440;

        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
    }
}