package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double distance = origin.distanceFromAnotherPoint(origin);

        assertEquals(0, distance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double distance1 = point1.distanceFromOrigin();
        double distance2 = point2.distanceFromOrigin();

        assertEquals(1, distance1);
        assertEquals(1, distance2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double distance = point1.distanceFromAnotherPoint(point2);

        assertEquals(2, distance);
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double direction1 = point1.directionFromOrigin();
        double direction2 = point2.directionFromOrigin();

        assertEquals(0, direction1);
        assertEquals(0, direction2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        double direction1 = point1.directionFromOrigin();
        double direction2 = point2.directionFromOrigin();

        assertEquals(Math.PI, direction1);
        assertEquals(Math.PI, direction2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        double direction1 = point1.directionFromOrigin();
        double direction2 = point2.directionFromOrigin();

        assertEquals(Math.PI / 2, direction1);
        assertEquals(Math.PI / 2, direction2);
    }

    @Test
    void directionBetweenTwoPointsShouldBeSpecifiedRadians() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(5, 1);

        double direction = point1.directionFromAnotherPoint(point2);

        assertEquals(Math.PI, direction);
    }
}
