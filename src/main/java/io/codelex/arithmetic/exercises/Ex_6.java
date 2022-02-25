package io.codelex.arithmetic.exercises;

public class Ex_6 {
    public static void main(String[] args) {

        int n = 110;

        for (int i = 1; i <= n; i++) {

            if (i % 7 == 0 && i % 5 == 0 && i % 3 == 0 && i % 11 == 0) {
                System.out.print("CozaLozaWoza " + "\n");
            } else if (i % 7 == 0 && i % 5 == 0 && i % 11 == 0) {
                System.out.print("LozaWoza " + "\n");
            } else if (i % 7 == 0 && i % 3 == 0 && i % 11 == 0) {
                System.out.print("CozaWoza " + "\n");
            } else if (i % 5 == 0 && i % 3 == 0 && i % 11 == 0) {
                System.out.print("CozaLoza " + "\n");
            } else if (i % 7 == 0 && i % 11 == 0) {
                System.out.print("Woza " + "\n");
            } else if (i % 5 == 0 && i % 11 == 0) {
                System.out.print("Loza " + "\n");
            } else if (i % 3 == 0 && i % 11 == 0) {
                System.out.print("Coza " + "\n");
            } else if (i % 11 == 0) {
                System.out.print(i + "\n");
            } else if (i % 7 == 0 && i % 5 == 0 && i % 3 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 7 == 0 && i % 5 == 0) {
                System.out.print("LozaWoza ");
            } else if (i % 7 == 0 && i % 3 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
