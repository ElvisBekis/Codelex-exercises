package io.codelex.classesandobjects.practice.exercises;

public class Ex5DateTest {
    public static void main(String[] args) {

        Ex5Date date = new Ex5Date("March", 7, 2022);

        date.setYear(2002);
        date.setMonth("January");
        date.setDay(30);

        date.displayDate();
    }
}
