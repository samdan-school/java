package HW_1;

public class TwoRectangles {
    class Rectangle {
        double x;
        double y;
        double height;
        double width;

        Rectangle(double x, double y, double height, double width) {
            this.x = x;
            this.y = y;
            this.height = height;
            this.width = width;
        }
    }

    Rectangle recOne;
    Rectangle recTwo;
    double xDistance;
    double yDistance;

    TwoRectangles(double x1, double y1, double height1, double width1, double x2, double y2, double height2, double width2) {
        this.recOne = new Rectangle(x1, y1, height1, width1);
        this.recTwo = new Rectangle(x2, y2, height2, width2);
        xDistance = calculateDistance(x1, x2);
        yDistance = calculateDistance(y1, y2);
        checkOverlap();
    }

    double calculateDistance(double d1, double d2) {
        return Math.abs(d1 - d2);
    }

    void checkOverlap() {
        if (inside()) {
            System.out.println("r2 is inside r1");
            return;
        }
        if (overlap()) {
            System.out.println("r2 overlaps r1");
            return;
        }
        System.out.println("r2 does not overlaps r1");
    }

    boolean inside() {
        return xDistance <= (recOne.width - recTwo.width) / 2 && yDistance <= (recOne.height - recTwo.height) / 2;
    }

    boolean overlap() {
        return xDistance <= (recOne.width + recTwo.width) / 2 && yDistance <= (recOne.height + recTwo.height) / 2;
    }

    public static void main(String args[]) {
        // 2.5, 4, 2.5, 43, 1.5, 5, 0.5, 3
        // 1, 2, 3, 5.5, 3, 4, 4.5, 5
        // 1, 2, 3, 3, 0, 45, 3, 2
        new TwoRectangles(2.5, 4, 2.5, 43, 1.5, 5, 0.5, 3);
    }
}
