package io.codelex.enums.practice;

import static io.codelex.enums.practice.CardinalPoints.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(NORTH.direction + ":" + NORTH.text + ":" + NORTH.ordinal());
        System.out.println(SOUTH.direction + ":" + SOUTH.text + ":" + SOUTH.ordinal());
        System.out.println(EAST.direction + ":" + EAST.text + ":" + EAST.ordinal());
        System.out.println(WEST.direction + ":" + WEST.text + ":" + WEST.ordinal());
    }
}
