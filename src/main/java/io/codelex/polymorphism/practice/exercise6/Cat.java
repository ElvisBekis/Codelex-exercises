package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline {

    private String breed;

    public Cat(String type, String name, double weight, String region, String breed) {
        super(name, type, weight, region);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(String food) {
        String[] splitFood = food.split("\\s+");
        if (splitFood[0].equals("Vegetables")) {
            setFoodEaten(getFoodEaten() + Integer.parseInt(splitFood[1]));
        } else if (splitFood[0].equals("Meat")) {
            setFoodEaten(getFoodEaten() + Integer.parseInt(splitFood[1]));
        } else {
            System.out.println("There is not such food!");
        }
    }

    @Override
    public String toString() {
        return getType() + "["
                + getName() + ", "
                + breed + ", "
                + format.format(getWeight()) + ", "
                + getRegion() + ", "
                + getFoodEaten() + "]";
    }
}
