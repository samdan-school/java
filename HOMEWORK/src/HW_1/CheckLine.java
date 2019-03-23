package HW_1;

import java.util.Scanner;

public class CheckLine {
    CheckLine() {
        findInsertion();
    }

    void findInsertion() {
        Scanner input = new Scanner(System.in);
        float[] points = new float[8];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < 8; i++) {
            points[i] = input.nextFloat();
        }

        float m1 = (points[3] - points[1]) / (points[2] - points[0]);
        float m2 = (points[7] - points[5]) / (points[6] - points[4]);

        if (m1 != m2) {
            // y = mx + b => b = y - mx
            float b1 = points[1] - m1 * points[0];
            float b2 = points[7] - m2 * points[6];

            float insertX = (b2 - b1) / (m1 - m2);
            float insertY = m1 * insertX + b1;

            System.out.println("The intersecting point is at (" + insertX + ", " + insertY + ")");
        } else {
            System.out.println("The two lines are parallel");
        }
    }

    public static void main(String[] args) {
        // 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
        // 2 2 7 6.0 4.0 2.0 -1.0 -2.0
        new CheckLine();
    }
}
