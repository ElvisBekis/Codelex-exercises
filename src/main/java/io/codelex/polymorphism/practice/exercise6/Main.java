package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        boolean isAnimal = true;

        while (isAnimal) {
            String choice = input.next();
            String food;

            switch (choice) {
                case "End":
                    isAnimal = false;
                    System.out.println(animals);
                    break;
                case "Cat":
                    Animal cat = new Cat(choice, input.next(), input.nextDouble(), input.next(), input.next());
                    input.nextLine();
                    cat.makeSound();
                    food = input.nextLine();
                    cat.eat(food);
                    System.out.println(cat);
                    animals.add(cat);
                    break;
                case "Tiger":
                    Animal tiger = new Tiger(choice, input.next(), input.nextDouble(), input.next());
                    input.nextLine();
                    tiger.makeSound();
                    food = input.nextLine();
                    tiger.eat(food);
                    System.out.println(tiger);
                    animals.add(tiger);
                    break;
                case "Mouse":
                    Animal mouse = new Mouse(choice, input.next(), input.nextDouble(), input.next());
                    input.nextLine();
                    mouse.makeSound();
                    food = input.nextLine();
                    mouse.eat(food);
                    System.out.println(mouse);
                    animals.add(mouse);
                    break;
                case "Zebra":
                    Animal zebra = new Zebra(choice, input.next(), input.nextDouble(), input.next());
                    input.nextLine();
                    zebra.makeSound();
                    food = input.nextLine();
                    zebra.eat(food);
                    System.out.println(zebra);
                    animals.add(zebra);
                    break;
            }
        }
    }
}
