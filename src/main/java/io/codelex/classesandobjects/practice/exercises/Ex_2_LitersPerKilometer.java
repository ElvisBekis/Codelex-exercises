package io.codelex.classesandobjects.practice.exercises;

import java.util.Scanner;

public class Ex_2_LitersPerKilometer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double startKilometers;
        double endKilometers;
        double liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();
        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();
        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Ex_2_Car car = new Ex_2_Car(startKilometers);
        car.fillUp(endKilometers, liters);

        System.out.println("Liters per 100 kilometers are " + car.calculateConsumption());

        if (car.gasHog()) {
            System.out.println("Car is a gas hog!");
        }
        if (car.economyCar()) {
            System.out.println("Car is an economy car!");
        }
    }
}

