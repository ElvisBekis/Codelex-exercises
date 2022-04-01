package io.codelex.classesandobjects.practice.exercises;

public class Ex2Car {

    private final double startOdo;
    private double endOdo;
    private double liters;
    private final double GASHOG = 15.0;
    private final double ECONOMYCAR = 5.0;

    public Ex2Car(double startOdo) {
        this.startOdo = startOdo;
    }

    public void fillUp(double mileage, double liters) {
        this.endOdo = mileage;
        this.liters = liters;
    }

    public double calculateConsumption() {
        //calculate l/100km
        return (liters / (endOdo - startOdo)) * 100;
    }

    public boolean gasHog() {
        return calculateConsumption() > GASHOG;
    }

    public boolean economyCar() {
        return calculateConsumption() < ECONOMYCAR;
    }


}
