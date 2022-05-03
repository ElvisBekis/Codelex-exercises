package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String type, String name, double weight, String region) {
        super(name, type, weight, region);
    }

    @Override
    public void makeSound() {
        System.out.println("zzzzzz");
    }

    @Override
    public void eat(String food) {
        String[] splitFood = food.split("\\s+");
        if (splitFood[0].equals("Meat")) {
            System.out.println("Zebras are not eating that type of food!");
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
                + FORMAT.format(getWeight()) + ", "
                + getRegion() + ", "
                + getFoodEaten() + "]";
    }
}
