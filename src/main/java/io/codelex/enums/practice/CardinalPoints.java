package io.codelex.enums.practice;

public enum CardinalPoints {

    NORTH("North", "up"),
    SOUTH("South", "down"),
    EAST("East", "right"),
    WEST("West", "left");

    public final String direction;
    public final String text;

    CardinalPoints(String direction, String text) {
        this.direction = direction;
        this.text = text;
    }
}
