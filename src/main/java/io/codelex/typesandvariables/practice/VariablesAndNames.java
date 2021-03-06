package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class VariablesAndNames {
    public static void main(String[] args) {
            int cars;
            int drivers;
            int passengers;
            int carsNotDriven;
            int carsDriven;
            int seatsInACar;
            int carpoolCapacity;
            double averagePassengersPerCar;



        cars = 100;
        seatsInACar = 4;
        drivers = 30;
        passengers = 90;
        carsNotDriven = cars - drivers;
        carsDriven = drivers;
        carpoolCapacity = carsDriven * seatsInACar;
        averagePassengersPerCar = ((double) passengers) / carsDriven;
        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + df.format(averagePassengersPerCar) + " in each car.");
    }
}