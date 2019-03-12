package ex_11_1;

public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle() {
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3, String color, Boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        return 0.25 * Math.sqrt( (this.side1 + this.side2 + this.side3) * (-this.side1 + this.side2 + this.side3) * (this.side1 - this.side2 + this.side3) * (this.side1 + this.side2 - this.side3) );
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public String toString() {
        return  "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + "\n" + super.toString();
    }
}
