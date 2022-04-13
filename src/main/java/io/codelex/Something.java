package io.codelex;

import java.util.ArrayList;
import java.util.List;

public class Something {
    public static void main(String[] args) {

        Milk milk = new Milk();
        Bottle<Milk> milkBottle = new Bottle<>(milk);
        milkBottle.pourOutContents();

        Bottle<Vodka> vodkaBottle = createBottleWithContents(new Vodka());
        vodkaBottle.pourOutContents();
        Integer number = 10;
        printOut(number, "Some other text!");
        String text = "Some text!";
        printOut(text, number);

    }

    public static <T extends Liquid> Bottle<T> createBottleWithContents(T contents) {
        Bottle<T> newBottle = new Bottle<>(contents);
        return newBottle;
    }

    public static <T> void printOut(T someObject, T otherObject) {

        List<T> newList = new ArrayList<>();
        newList.add(someObject);
        newList.add(otherObject);

        System.out.println(newList);
    }


}