package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    private final Dimensions dimension;
    private final int numberOfCopies;
    private final int cost;


    public Poster(int fee, Dimensions dimension, int numberOfCopies, int cost) {
        super(fee);
        this.dimension = dimension;
        this.numberOfCopies = numberOfCopies;
        this.cost = cost;


    }

    public int cost() {
        return numberOfCopies * dimension.getCost();
    }


    @Override
    public String toString() {
        return super.toString()
                + " Poster:"
                + " dimension=" + dimension
                + ", cost=" + dimension.getCost()
                + ", numberOfCopies="
                + numberOfCopies + " ";
    }
}
