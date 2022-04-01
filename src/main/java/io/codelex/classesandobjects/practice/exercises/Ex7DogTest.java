package io.codelex.classesandobjects.practice.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex7DogTest {
    public static void main(String[] args) {

        List<Ex7Dog> dogs = new ArrayList<>();

        Ex7Dog max = new Ex7Dog("Max", Sex.MALE);
        Ex7Dog rocky = new Ex7Dog("Rocky", Sex.MALE);
        Ex7Dog sparky = new Ex7Dog("Sparky", Sex.MALE);
        Ex7Dog buster = new Ex7Dog("Buster", Sex.MALE);
        Ex7Dog sam = new Ex7Dog("Sam", Sex.MALE);
        Ex7Dog lady = new Ex7Dog("Lady", Sex.FEMALE);
        Ex7Dog molly = new Ex7Dog("Molly", Sex.FEMALE);
        Ex7Dog coco = new Ex7Dog("Coco", Sex.FEMALE);
        dogs.add(max);
        dogs.add(rocky);
        dogs.add(sparky);
        dogs.add(buster);
        dogs.add(sam);
        dogs.add(lady);
        dogs.add(molly);
        dogs.add(coco);

        max.assignParents(rocky, lady);
        coco.assignParents(buster, molly);
        rocky.assignParents(molly, sam);
        buster.assignParents(sparky, lady);

        for (Ex7Dog dog : dogs) {
            System.out.println(dog + "father: " + dog.fathersName());
        }

        System.out.println(max.hasSameMother(buster));
        System.out.println(sparky.hasSameMother(lady));


    }
}
