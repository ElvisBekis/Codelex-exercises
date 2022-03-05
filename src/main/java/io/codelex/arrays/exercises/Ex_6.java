package io.codelex.arrays.exercises;


import java.util.Random;


public class Ex_6 {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myIntArray[i] = rand.nextInt(100) + 1;
        }

        int[] myIntArray2 = myIntArray.clone();

        myIntArray[9] = -7;

        System.out.print("Array 1: ");
        for (Integer i : myIntArray)
            System.out.print(i + " ");

        System.out.println();

        System.out.print("Array 2: ");
        for (Integer i : myIntArray2)
            System.out.print(i + " ");
    }
}
