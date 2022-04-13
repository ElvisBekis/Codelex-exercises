package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};
        String[] arrayValue = {"Germany", "Germany", "Japan", "Germany", "Germany", "germany", "USA"};

        //todo - replace array with an ArrayList and print out the results
        List<String> arrayList = Arrays.asList(array);
        System.out.println(arrayList);

        //todo - replace array with a HashSet and print out the results
        Set<String> arraySet = new HashSet<>(Arrays.asList(array));
        System.out.println(arraySet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> arrayMap = new HashMap<>();
        if (array.length == arrayValue.length) {
            for (int i = 0; i < array.length; i++) {
                arrayMap.put(array[i], arrayValue[i]);
            }
        }
        System.out.println(arrayMap);

    }
}
