package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int x = input.nextInt();
        checkOddEven(x);
        System.out.print("bye!");
    }

    public static void checkOddEven(int x) {
        if (x % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }


}
