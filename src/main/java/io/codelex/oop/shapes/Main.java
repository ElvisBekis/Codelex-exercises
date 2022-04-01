package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {

        Triangle tri = new Triangle(4, 3);
        System.out.println(tri.getNumEdges());
        System.out.println(tri.getArea());
        System.out.println(tri.getPerimeter());

        Rectangle rec = new Rectangle(4, 3);
        System.out.println(rec.getNumEdges());
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
    }
}
