package io.codelex.classesandobjects.practice.exercises;

import java.util.Scanner;

public class Ex_5_DateTest {
    public static void main(String[] args) {

        Ex_5_Date date = new Ex_5_Date("March", 7, 2022 );

        date.setYear(2002);
        date.setMonth("January");
        date.setDay(30);
        
        date.displayDate();
    }
}
