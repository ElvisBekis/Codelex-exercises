package io.codelex.oop.shapes;

public class Triangle extends Shape {

    private final int width;
    private final int height;

    public Triangle(int w, int h) {
        super(3);
        this.height = h;
        this.width = w;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return width * getNumEdges();
    }
}
