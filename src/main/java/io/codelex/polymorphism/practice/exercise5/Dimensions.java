package io.codelex.polymorphism.practice.exercise5;

public enum Dimensions {

    A0(100),
    A1(85),
    A2(70),
    A3(55),
    A4(40),
    A5(25),
    A6(10),
    A7(5);

    private int cost;

    private Dimensions(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
