package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        ArrayList<String> stringList = new ArrayList<>();
        //TODO: Add 10 values to list
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        stringList.add("6");
        stringList.add("7");
        stringList.add("8");
        stringList.add("9");
        stringList.add("10");
        //TODO: Add new value at 5th position
        stringList.add(4, "4.5");
        //TODO: Change value at last position (Calculate last position programmatically)
        stringList.set(stringList.size() - 1, "11");
        //TODO: Sort your list in alphabetical order
        Collections.sort(stringList);
        //TODO: Check if your list contains "Foobar" element
        if (stringList.contains("Foobar")) {
            System.out.println("It contains!");
        } else {
            System.out.println("It does not contain!");
        }

        //TODO: Print each element of list using loop
        for (String element : stringList) {
            System.out.println(element);
        }
    }

}
