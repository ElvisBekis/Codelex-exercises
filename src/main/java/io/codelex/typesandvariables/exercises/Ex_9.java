package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter distance in meters: ");
        float distance = myObj.nextFloat();
        System.out.println("Enter time in hours:");
        float hour = myObj.nextFloat();
        System.out.println("Enter time in minutes:");
        float minute = myObj.nextFloat();
        System.out.println("Enter time in seconds:");
        float second = myObj.nextFloat();

        float allSec = (hour * 3600) + (minute * 60) + second;

        float ms = distance / allSec;
        float kmh = (distance/1000.0f) / (allSec/3600.0f); 
        float mh = kmh / 1.609f;


        System.out.println("Your speed in meters/second is " + ms);
        System.out.println("Your speed in km/h is " + kmh);
        System.out.println("Your speed in miles/h is " + mh);
    }
}
