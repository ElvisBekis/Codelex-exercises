package io.codelex.classesandobjects.practice.exercises;

public class Ex1Product {

    String name;
    double priceAtStart;
    int amountAtStart;

    public Ex1Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public double getPriceAtStart() {
        return priceAtStart;
    }

    public int getAmountAtStart() {
        return amountAtStart;
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + priceAtStart + ", amount " + amountAtStart);
    }


}
