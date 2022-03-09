package io.codelex.classesandobjects.practice.exercises;

public class Ex_1_main {
    public static void main(String[] args) {

        Ex_1_Product product1 = new Ex_1_Product("Logitech mouse", 70.00, 14);
        Ex_1_Product product2 = new Ex_1_Product("iPhone 5s", 999.99, 3);
        Ex_1_Product product3 = new Ex_1_Product("Epson EB-U05", 440.46, 1);

        product1.setAmountAtStart(10);
        product2.setPriceAtStart(500.00);

        System.out.println(product1.name + ", " + product1.priceAtStart + " EUR, " + product1.amountAtStart + " units");
        System.out.println(product2.name + ", " + product2.priceAtStart + " EUR, " + product2.amountAtStart + " units");
        System.out.println(product3.name + ", " + product3.priceAtStart + " EUR, " + product3.amountAtStart + " units");



    }
}
