package e_6_4;

public class TestResizableCircle {
    ResizableCircle resizableCircle;
    public TestResizableCircle() {
        resizableCircle = new ResizableCircle(100);
        System.out.println("Before: " + resizableCircle.radius);
        resizableCircle.resize(10);
        System.out.println("After Resize: " + resizableCircle.radius);
    }

    public static void main(String[] args) {
        new TestResizableCircle();
    }
}
