package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Enter launch date [dd.MM.yyyy]: ");
        LocalDate launch = LocalDate.parse(input.nextLine(), dtf);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        System.out.println("Enter month: ");
        input.nextLine();
        String month = input.nextLine().toUpperCase();

        biweeklyUpdate(launch, year, Month.valueOf(month));
    }

    public static void biweeklyUpdate(LocalDate launch, int year, Month month) {

        final int INCREMENT = 1;
        Month[] months = {Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.JUNE, Month.JULY,
                Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER};


        while (launch.getYear() <= year) {
            launch = launch.plusDays(14);
            if (launch.getYear() == year && months[launch.getMonthValue() - INCREMENT].equals(month)) {
                System.out.print(launch.getDayOfMonth() + " ");
            }
        }
    }
}


