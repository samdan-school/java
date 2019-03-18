package e_6_4;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle() {
        super();
    }

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percent) {
        this.radius = this.radius * percent / 100;
        return this.radius;
    }
}
