package ex_11_1;

import java.util.Scanner;

public class TestTriangle {
    Triangle triangle;
    public TestTriangle() {
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        String color;
        boolean filled;
        System.out.println("Enter side1: ");
        side1 = input.nextDouble();
        System.out.println("Enter side2: ");
        side2 = input.nextDouble();
        System.out.println("Enter side3: ");
        side3 = input.nextDouble();
        System.out.println("Enter Color: ");
        color = input.next();
        System.out.println("Is Filled: ");
        filled = input.nextBoolean();

        triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.println(triangle);
    }
    public static void main(String[] args) {
        new TestTriangle();
    }
}
