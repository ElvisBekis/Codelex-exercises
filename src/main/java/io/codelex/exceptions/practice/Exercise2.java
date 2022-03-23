package io.codelex.exceptions.practice;

public class Exercise2 {

    public static void main(String[] args) {

        methodA();

    }

    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodC() throws ArithmeticException {
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
