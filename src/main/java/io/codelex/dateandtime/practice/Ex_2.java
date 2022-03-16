package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex_2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Enter launch date [dd.MM.yyyy]: ");
        LocalDate launch = LocalDate.parse(input.nextLine(), dtf);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        System.out.println("Enter month: ");
        input.nextLine();
        String month = input.nextLine();

        biweeklyUpdate(launch, year, month);
    }

    public static void biweeklyUpdate(LocalDate launch, int year, String month) {

        String[] months = {" ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        LocalDate l = launch;
        int y = year;
        String m = month;

        while (l.getYear() <= y) {
            l = l.plusDays(14);
            if (l.getYear() == y && months[l.getMonthValue()].equals(m)) {
                System.out.print(l.getDayOfMonth() + " ");
            }
        }
    }
}


