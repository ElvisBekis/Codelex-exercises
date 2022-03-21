package io.codelex.oop.shapes;

public class Cube extends ThreeDimensionalShape {

    private final int length;

    public Cube(int numEdges, int length) {
        super(12);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length * 6;
    }

    @Override
    public double getPerimeter() {
        return getNumEdges() * length;
    }

    @Override
    public double getVolume() {
        return length * length * length;
    }
}
