package io.codelex.classesandobjects.practice.exercises;

public class Ex3FuelGauge {

    final static int MAX_LITER_CAPACITY = 70;
    private int liters;


    public Ex3FuelGauge(int liters) {
        if (liters <= MAX_LITER_CAPACITY) {
            this.liters = liters;
        } else {
            liters = MAX_LITER_CAPACITY;
        }
    }

    public int getLiters() {
        return liters;
    }

    public void addLiters() {
        if (liters < MAX_LITER_CAPACITY) {
            liters++;
        } else {
            System.out.println("FUEL OVERFLOWING!!!");
        }
    }

    public void burnLiters() {
        if (liters > 0) {
            liters--;
        } else {
            System.out.println("OUT OF FUEL!!!");
        }
    }
}
