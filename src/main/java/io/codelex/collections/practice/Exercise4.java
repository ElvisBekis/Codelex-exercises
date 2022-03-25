package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        String name = null;
        System.out.println("Enter name: ");
        while ((name = input.nextLine()).length() > 0) {
            System.out.println("Enter name: ");
            names.add(name);
        }
        System.out.println("Unique name list contains: " + names.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", ""));
    }
}
