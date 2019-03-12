package e_10_12;

public class Triangle2D {
    public MyPoint p1;
    public MyPoint p2;
    public MyPoint p3;

    public Triangle2D() {
        this.p1 = new MyPoint(0, 0);
        this.p2 = new MyPoint(1, 1);
        this.p3 = new MyPoint(2, 5);
    }

    public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.p1 = new MyPoint(x1, y1);
        this.p2 = new MyPoint(x2, y2);
        this.p3 = new MyPoint(x3, y3);
    }

    public Triangle2D(Triangle2D triangle2D) {
        this.p1 = new MyPoint(triangle2D.p1);
        this.p2 = new MyPoint(triangle2D.p2);
        this.p3 = new MyPoint(triangle2D.p3);
    }

    public double getArea() {
        return Math.abs(
                (
                        this.p1.getX() * (this.p2.getY() - this.p3.getY()) +
                                this.p2.getX() * (this.p3.getY() - this.p1.getY()) +
                                this.p3.getX() * (this.p1.getY() - this.p2.getY())
                ) / 2
        );
    }

    public double getPerimeter() {
        return this.p1.distance(this.p2) + this.p1.distance(this.p3) + this.p2.distance(this.p3);
    }

    public boolean contains(MyPoint p) {
        Triangle2D a = new Triangle2D(this);
        a.p1 = p;
        Triangle2D b = new Triangle2D(this);
        b.p2 = p;
        Triangle2D c = new Triangle2D(this);
        c.p3 = p;

        return this.getArea() >= (a.getArea() + b.getArea() + c.getArea());
    }

    public boolean contains(Triangle2D triangle) {
        return contains(triangle.p1) && contains(triangle.p2) && contains(triangle.p3);
    }

    public boolean overlaps(Triangle2D triangle) {
        boolean checkViaCoordinates = ((contains(triangle.p1) ? 1 : 0) + (contains(triangle.p2) ? 1 : 0) + (contains(triangle.p3) ? 1 : 0)) < 3 &&
                ((contains(triangle.p1) ? 1 : 0) + (contains(triangle.p2) ? 1 : 0) + (contains(triangle.p3) ? 1 : 0)) > 0;

        return checkViaCoordinates;
    }

    public boolean linesIntersection(MyPoint p1, MyPoint p2, MyPoint n1, MyPoint n2) {
        double m1 = (p1.getX() - p2.getX()) / (p1.getY() - p2.getY());
        double m2 = (n1.getX() - n2.getX()) / (n1.getY() - n2.getY());
        if (m1 == m2)
            return false;

        double c1 = p1.getY() - m1 * p1.getX();
        double c2 = n1.getY() - m2 * n1.getX();

        double iX = (c2 - c1) / (m1 - m2);
        double iY = m1 * iX + c1;

        System.out.println(iX + " " + iY);
        System.out.println(c1 + " " + c2);
        System.out.println(m1 + " " + m2);

        return true;
    }

    public static void main(String[] args) {
        Triangle2D m = new Triangle2D(0, 0, 0, 5, 5, 0);
        Triangle2D n = new Triangle2D(-1, 1, 2, 0.1, 0.1, 2);
        System.out.println(m.contains(n));
        System.out.println(m.overlaps(n));
    }
}