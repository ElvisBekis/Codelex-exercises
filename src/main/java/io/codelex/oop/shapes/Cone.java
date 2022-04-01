package io.codelex.oop.shapes;

public class Cone extends ThreeDimensionalShape {

    private final int slopeLength;
    private final int baseRadius;

    public Cone(int numEdges, int slopeLength, int baseRadius) {
        super(1);
        this.slopeLength = slopeLength;
        this.baseRadius = baseRadius;
    }

    private double getHeight() {
        return Math.sqrt(slopeLength * slopeLength - baseRadius * baseRadius);
    }

    @Override
    public double getArea() {
        return Math.PI * baseRadius * baseRadius + Math.PI * baseRadius * getHeight();
    }

    @Override
    public double getPerimeter() {
        return Math.PI * baseRadius * 2 + slopeLength * 2;
    }

    @Override
    public double getVolume() {
        return Math.PI * baseRadius * baseRadius * getHeight() / 3;
    }
}
