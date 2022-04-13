package io.codelex.enums.practice;

public enum CardinalPoints {

    North("up"),
    South("down"),
    East("right"),
    West("left");


    private final String text;

    CardinalPoints(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
