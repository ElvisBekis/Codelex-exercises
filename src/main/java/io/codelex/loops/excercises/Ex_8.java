package io.codelex.loops.excercises;

public class Ex_8 {
    public static void main(String[] args) {

        Integer SIZE_CONSTANT = 3;

        for (int i = 1; i <= SIZE_CONSTANT; i++) {
            for (int j = 1; j <= (SIZE_CONSTANT * 4) - (4 * i); j++) {
                System.out.print("/");
            }

            for (int j = 1; j <= 8 * i - 8; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (SIZE_CONSTANT * 4) - (4 * i); j++) {
                System.out.print("\\");
            }

            System.out.println();
        }


    }
}
