package Circle;

public class TestCircle2D {
    Circle2D circle;

    public TestCircle2D() {
        circle = new Circle2D(1, 5, 4);

        Circle2D a = new Circle2D(1, 6, 2);

        System.out.println(circle);
        System.out.println(circle.overlaps(a));
    }

    public static void main(String[] args) {
        new TestCircle2D();
    }
}
