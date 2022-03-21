package io.codelex.oop.shapes;

public abstract class Shape {

    private final int numEdges;

    public Shape(int numEdges) {
        this.numEdges = numEdges;
    }

    public int getNumEdges() {
        return numEdges;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
