package io.codelex.classesandobjects.practice.exercises;

public class Ex_3_Odometer {

    public int MAX_MILEAGE = 999999;

    public int KM_PER_L = 10;

    int startOdo;
    int mileage;

    private Ex_3_FuelGauge fuelGauge;

    public Ex_3_Odometer(int mileage, Ex_3_FuelGauge fuelGauge) {
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
