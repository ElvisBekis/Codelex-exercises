package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex_1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Enter start date [dd.MM.yyyy]: ");
        LocalDate start = LocalDate.parse(input.nextLine(), dtf);
        System.out.println("Enter end date [dd.MM.yyyy]: ");
        LocalDate end = LocalDate.parse(input.nextLine(), dtf);

        end = end.plusDays(1);

        System.out.println((countWorkingDays(start, end).size()) * 8);
    }

    private static List<LocalDate> countWorkingDays(LocalDate start, LocalDate end) {

        Predicate<LocalDate> isWeekend = date -> date.getDayOfWeek() == DayOfWeek.SATURDAY
                || date.getDayOfWeek() == DayOfWeek.SUNDAY;

        List<LocalDate> workingDays = start.datesUntil(end).filter(isWeekend.negate()).collect(Collectors.toList());

        return workingDays;
    }
}

