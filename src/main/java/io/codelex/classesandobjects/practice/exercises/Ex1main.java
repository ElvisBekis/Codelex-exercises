package io.codelex.classesandobjects.practice.exercises;

public class Ex1main {
    public static void main(String[] args) {

        Ex1Product product1 = new Ex1Product("Logitech mouse", 70.00, 14);
        Ex1Product product2 = new Ex1Product("iPhone 5s", 999.99, 3);
        Ex1Product product3 = new Ex1Product("Epson EB-U05", 440.46, 1);

        product1.setAmountAtStart(10);
        product2.setPriceAtStart(500.00);

        System.out.println(product1.name + ", " + product1.priceAtStart + " EUR, " + product1.amountAtStart + " units");
        System.out.println(product2.name + ", " + product2.priceAtStart + " EUR, " + product2.amountAtStart + " units");
        System.out.println(product3.name + ", " + product3.priceAtStart + " EUR, " + product3.amountAtStart + " units");


    }
}
