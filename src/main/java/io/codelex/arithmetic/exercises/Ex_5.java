package io.codelex.arithmetic.exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random n = new Random();
        int upperbound = 100;
        int n_random = n.nextInt(upperbound);

        System.out.print("I'm thinking of a number between 1-100. Try to guess it.");
        int x = input.nextInt();

        if (x == n_random){
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (x > n_random) {
            System.out.println("Sorry, you are too high.  I was thinking of " + n_random);
        } else {
            System.out.println("Sorry, you are too low.  I was thinking of " + n_random);
        }

    }
}
