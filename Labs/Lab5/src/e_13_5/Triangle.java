package e_13_5;

import java.security.cert.TrustAnchor;

public class Triangle extends GeometricObject{
    public double sideA, sideB, sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double sideA, double sideB, double sideC) {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsideA = " + this.getSideA() + "\nsideB = " + this.getSideB() + "\nsideC = " + this.getSideC() + "\nPerimeter = " + this.getPerimeter() + "\nArea = " + this.getArea();
    }

    @Override
    public double getPerimeter() {
        return this.getSideA() + this.getSideB() + this.getSideC();
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p*(p-this.getSideA())*(p-this.getSideB())*(p-this.getSideC()));
    }


    public static void main(String[] args) {

    }
}
