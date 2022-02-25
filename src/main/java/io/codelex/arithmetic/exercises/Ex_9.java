package io.codelex.arithmetic.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight in kg!");
        double x = input.nextDouble();
        System.out.println("Please enter your height in cm!");
        double y = input.nextDouble();

        double weightToPounds = x * 2.204623;
        double heightToInches = y * 0.39370;

        double bmi = (weightToPounds * 703) / (heightToInches * heightToInches);
        DecimalFormat df = new DecimalFormat("0.0");

        if (bmi > 25) {
            System.out.print("Your bmi is: " + df.format(bmi) + " You are overweight!");
        } else if (bmi < 18.5) {
            System.out.print("Your bmi is: " + df.format(bmi) + " You are underweight!");
        } else {
            System.out.print("Your bmi is: " + df.format(bmi) + " You have optimal weight!");
        }
    }
}
