package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distanceFromAnotherPoint(Point point) {
        double xDistance = x - point.getX();
        double yDistance = y - point.getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double directionFromOrigin() {
        return Math.atan2(y, x);
    }

    public double directionFromAnotherPoint(Point point) {
        double xDistance = x - point.getX();
        double yDistance = y - point.getY();
        return Math.atan2(yDistance, xDistance);
    }
}
