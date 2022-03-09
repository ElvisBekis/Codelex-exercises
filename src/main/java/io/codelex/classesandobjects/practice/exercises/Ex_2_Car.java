package io.codelex.classesandobjects.practice.exercises;

public class Ex_2_Car {

    public double startOdo;
    public double endOdo;
    public double liters;

    public Ex_2_Car(double startOdo) {
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
        return calculateConsumption() > 15.0;
    }
    public boolean economyCar() {
        return calculateConsumption() < 5.0;
    }



}
