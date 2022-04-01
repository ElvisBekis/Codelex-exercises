package io.codelex.oop.shapes;

public abstract class ThreeDimensionalShape extends Shape {


    public ThreeDimensionalShape(int numEdges) {
        super(numEdges);
    }

    public abstract double getVolume();

}
