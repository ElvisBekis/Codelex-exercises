package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number : ");
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        System.out.print("Input number of terms : ");
        Scanner in2 = new Scanner(System.in);
        n = in2.nextInt();
        long result = 1;


        for (int j = n; j != 0; j--) {
            result *= i;
        }
        System.out.println(result);
    }

}
