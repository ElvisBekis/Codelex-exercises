package io.codelex.classesandobjects.practice.exercises;

public class Ex3main {
    public static void main(String[] args) {

        Ex3main carInstrumentSimulator = new Ex3main();

        Ex3FuelGauge fuel = new Ex3FuelGauge(0);
        Ex3Odometer odometer = new Ex3Odometer(0, fuel);

        for (int x = 0; x < Ex3FuelGauge.MAX_LITER_CAPACITY; x++) {
            fuel.addLiters();
        }

        while (fuel.getLiters() > 0) {

            odometer.addMileage();


            System.out.println("Mileage: " + +odometer.getMileage());
            System.out.println("Fuel level: " + fuel.getLiters() + " liters");
            System.out.println("------------------------------");
        }
    }
}
