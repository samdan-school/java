package e_13_5;

public class TestTriangle {
    TestTriangle() {
        System.out.println(GeometricObject.max(new Triangle(), new Triangle("White", true, 2, 2, 2)));
    }

    public static void main(String[] args) {
        new TestTriangle();
    }
}
