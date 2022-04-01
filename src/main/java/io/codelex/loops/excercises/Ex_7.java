package io.codelex.loops.excercises;


import java.util.Objects;
import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {


        int min = 1;
        int max = 6;

        System.out.println("Welcome to Piglet!");
        int sum = 0;
        boolean rollAgain = true;
        double dice = Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("You rolled a " + dice + "!");
        while (dice != 1 && rollAgain) {
            sum += dice;
            rollAgain = readBoolean();
            if (rollAgain) {
                dice = Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println("You rolled a " + dice + "!");
            }
        }
        if (dice == 1) {
            sum = 0;
        }
        System.out.print("You got " + sum + " points");
    }

    private static boolean readBoolean() {
        Scanner input = new Scanner(System.in);
        System.out.print("Roll again?" + " ");
        String n = input.next();
        return Objects.equals(n, "yes");
    }
}

