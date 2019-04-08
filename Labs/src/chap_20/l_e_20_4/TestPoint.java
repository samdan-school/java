package chap_20.l_e_20_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class TestPoint {
    Point[] points;

    TestPoint() {
        points = new Point[100];
        createPoint();
        sortPoints();
    }

    void createPoint() {
        Random rand = new Random(123);

        for (int i = 0; i < 100; i++) {
            points[i] = new Point(rand.nextInt(2000), rand.nextInt(2000));
        }
    }

    void sortPoints() {
        System.out.println("Before Sort");
        for (Point p : points) System.out.print(p + " ");

        Arrays.sort(points);
        System.out.println("\nAfter Sort");
        for (Point p : points) System.out.print(p + " ");
    }

    public static void main(String[] args) {
        new TestPoint();
    }
}
