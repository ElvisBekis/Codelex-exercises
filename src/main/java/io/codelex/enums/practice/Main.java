package io.codelex.enums.practice;

import static io.codelex.enums.practice.CardinalPoints.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(North.name() + ":" + North.getText() + ":" + North.ordinal());
        System.out.println(South.name() + ":" + South.getText() + ":" + South.ordinal());
        System.out.println(East.name() + ":" + East.getText() + ":" + East.ordinal());
        System.out.println(West.name() + ":" + West.getText() + ":" + West.ordinal());
    }
}
