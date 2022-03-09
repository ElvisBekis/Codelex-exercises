package io.codelex;

import java.math.BigDecimal;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceTo(Point p) {
        return Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX())
                + (this.getY() - p.getY()) * (this.getY() - p.getY()));
    }

    public static void main(String[] args) {

        Point p1 = new Point(-2, -4);
        Point p2 = new Point(10, 5);

        BigDecimal distance = BigDecimal.valueOf(p1.distanceTo(p2));
        System.out.println(distance);
    }

}
