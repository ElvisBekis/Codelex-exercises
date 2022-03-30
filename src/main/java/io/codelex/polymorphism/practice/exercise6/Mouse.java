package io.codelex.polymorphism.practice.exercise6;

import java.util.Locale;

public class Mouse extends Mammal {

    public Mouse(String type, String name, double weight, String region) {
        super(name, type, weight, region);
    }

    @Override
    public void makeSound() {
        System.out.println("piiiiiiiiiiiii");
    }

    @Override
    public void eat(String food) {
        String[] splitFood = food.split("\\s+");
        if (splitFood[0].equals("Meat")) {
            System.out.println("Mouses are not eating that type of food!");
        } else if (splitFood[0].equals("Vegetable")) {
            setFoodEaten(getFoodEaten() + Integer.parseInt(splitFood[1]));
        } else {
            System.out.println("There is not such food!");
        }
    }

    @Override
    public String toString() {
        return getType() + "["
                + getName() + ", "
                + format.format(getWeight()) + ", "
                + getRegion() + ", "
                + getFoodEaten() + "]";
    }
}
