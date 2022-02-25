package io.codelex.arithmetic.exercises;

public class Ex_4 {
    public static void main(String[] args) {

        int minNum = 1;
        int maxNum = 10;
        for (int n = 1; n <= maxNum; n++) {
            minNum *= n;
        }
        System.out.println(minNum);
    }
}
