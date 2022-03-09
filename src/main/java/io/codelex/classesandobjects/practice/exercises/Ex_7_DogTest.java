package io.codelex.classesandobjects.practice.exercises;

public class Ex_7_DogTest {
    public static void main(String[] args) {

        Ex_7_Dog[] dogs = new Ex_7_Dog[8];

        dogs[0] = new Ex_7_Dog("Max", "male");
        dogs[1] = new Ex_7_Dog("Rocky", "male");
        dogs[2] = new Ex_7_Dog("Sparky", "male");
        dogs[3] = new Ex_7_Dog("Buster", "male");
        dogs[4] = new Ex_7_Dog("Sam", "male");
        dogs[5] = new Ex_7_Dog("Lady", "female");
        dogs[6] = new Ex_7_Dog("Molly", "female");
        dogs[7] = new Ex_7_Dog("Coco", "female");

        dogs[0].assignParents(dogs[1], dogs[5]);
        dogs[7].assignParents(dogs[3], dogs[6]);
        dogs[1].assignParents(dogs[6], dogs[4]);
        dogs[3].assignParents(dogs[2], dogs[5]);

        for (Ex_7_Dog dog : dogs) {
            System.out.println(dog + "father: " + dog.fathersName());
        }

        System.out.println(dogs[0].hasSameMother(dogs[3]));
        System.out.println(dogs[0].hasSameMother(dogs[2]));


    }
}
