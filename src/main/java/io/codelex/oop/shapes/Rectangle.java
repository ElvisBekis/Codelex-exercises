package io.codelex.oop.shapes;

public class Rectangle extends Shape {

    private final int width;
    private final int height;

    public Rectangle(int w, int h) {
        super(4);
        this.height = h;
        this.width = w;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * (getNumEdges() / 2);
    }
}
