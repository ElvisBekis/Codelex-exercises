package io.codelex.classesandobjects.practice.exercises;

public class Ex3Odometer {

    private int MAX_MILEAGE = 999999;

    private int KM_PER_L = 10;

    private int startOdo;
    private int mileage;

    private Ex3FuelGauge fuelGauge;

    public Ex3Odometer(int mileage, Ex3FuelGauge fuelGauge) {
        this.startOdo = mileage;
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public int getMileage() {
        return mileage;
    }

    public void addMileage() {
        if (mileage < MAX_MILEAGE) {
            mileage++;
        } else {
            mileage = 0;
        }

        int driven = startOdo - mileage;
        if (driven % KM_PER_L == 0) {
            fuelGauge.burnLiters();
        }
    }
}
