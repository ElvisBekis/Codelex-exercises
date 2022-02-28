package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str;
        System.out.print("Please enter a String: ");
        str = in.next();

        int digit = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.toLowerCase().charAt(i)) {
                case 'a', 'b', 'c' -> digit = 2;
                case 'd', 'e', 'f' -> digit = 3;
                case 'g', 'h', 'i' -> digit = 4;
                case 'j', 'k', 'l' -> digit = 5;
                case 'm', 'n', 'o' -> digit = 6;
                case 'p', 'q', 'r', 's' -> digit = 7;
                case 't', 'u', 'v' -> digit = 8;
                case 'w', 'x', 'y', 'z' -> digit = 9;
            }
            System.out.print(digit);
        }
    }
}

