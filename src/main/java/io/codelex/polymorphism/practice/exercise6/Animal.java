package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Animal {

    private final String name;
    private final String type;
    private final double weight;
    private Integer foodEaten = 0;
    DecimalFormat FORMAT = new DecimalFormat("#.###");

    public Animal(String type, String name, double weight) {
        this.type = type;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public abstract void makeSound();

    public abstract void eat(String food);


    @Override
    public String toString() {
        return type + "["
                + name + ", "
                + FORMAT.format(weight) + ", "
                + foodEaten + "]";
    }
}

