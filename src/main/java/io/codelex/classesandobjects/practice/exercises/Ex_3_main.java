package io.codelex.classesandobjects.practice.exercises;

public class Ex_3_main {
    public static void main(String[] args) {

        Ex_3_main carInstrumentSimulator = new Ex_3_main();

        Ex_3_FuelGauge fuel = new Ex_3_FuelGauge(0);
        Ex_3_Odometer odometer = new Ex_3_Odometer(0, fuel);

        for (int x = 0; x < Ex_3_FuelGauge.MAX_LITER_CAPACITY; x++) {
            fuel.addLiters();
        }

        while(fuel.getLiters() > 0) {

            odometer.addMileage();


            System.out.println("Mileage: " + + odometer.getMileage());
            System.out.println("Fuel level: " + fuel.getLiters() + " liters");
            System.out.println("------------------------------");
        }
    }
}
