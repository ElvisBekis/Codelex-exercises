package io.codelex.oop.computers;

public class Main {
    public static void main(String[] args) {


        Computer comp1 = new Computer("AMD 5", "16 gb", "RTX 2070", "Samsung", "HVZ");
        Laptop lap1 = new Laptop("AMD 5", "16 gb", "RTX 2070", "Samsung", "HVZ", "Good");
        System.out.println(lap1);
        lap1.setCompany("Sony");
        System.out.println(lap1);
        System.out.println(lap1.getCompany());
    }
}
