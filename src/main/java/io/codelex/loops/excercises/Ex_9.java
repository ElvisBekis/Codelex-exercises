package io.codelex.loops.excercises;

import java.util.Random;
import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter desired number from 2 to 12: ");
        int desire = input.nextInt();
        System.out.println("Desired sum: " + desire);
        int sum = 0;

        do {
            int dice1 = r.nextInt(6) + 1;
            int dice2 = r.nextInt(6) + 1;
            sum = dice1 + dice2;
            System.out.println(dice1 + " and " + dice2 + " = " + sum);
        } while (sum != desire);
    }
}
