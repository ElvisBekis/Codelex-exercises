package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    private final Dimensions dimension;
    private final int numberOfCopies;


    public Poster(int fee, Dimensions dimension, int numberOfCopies, int cost) {
        super(fee);
        this.dimension = dimension;
        this.numberOfCopies = numberOfCopies;
        this.dimension.cost = cost;


    }

    public int cost() {
        return numberOfCopies * dimension.cost;
    }


    @Override
    public String toString() {
        return super.toString()
                + " Poster:"
                + " dimension=" + dimension
                + ", cost=" + dimension.cost
                + ", numberOfCopies="
                + numberOfCopies + " ";
    }
}
