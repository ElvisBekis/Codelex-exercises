package io.codelex;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Author {

    private static String firstname;
    private static String lastname;
    private static LocalDate dateOfBirth;
    private static ArrayList<String> books = new ArrayList<>();
    public static final int BOOKS_IN_THE_WORLD = 129864880;

    public Author(String firstname, String lastname, LocalDate dateOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    public void addBook(String x) {
        books.add(x);
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    public boolean hasWrittenBook(String x) {
        if (books.contains(x)) {
            return true;
        }
        return false;
    }

    public void printAllInfo() {
        System.out.println("Author " + firstname + " " + lastname);
        System.out.println("His age is " + getAge() + " at the moment");
        System.out.println("He has written " + books.size() + " books");
        System.out.println("Elvis");
    }

    @Override
    public String toString() {
        return "Author{firstName=" + firstname + ", lastName=" + lastname + ", dateOfBirth=" + dateOfBirth + ", books= " + books + "}";

    }


}
