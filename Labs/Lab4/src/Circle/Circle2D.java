package Circle;

public class Circle2D {
    double x, y;
    double radios;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadios() {
        return radios;
    }

    public Circle2D() {
        this.x = 0.0;
        this.y = 0.0;
        this.radios = 1.0;
    }

    public Circle2D(double x, double y, double radios) {
        this.x = x;
        this.y = y;
        this.radios = radios;
    }

    public double getArea() {
        return Math.PI * this.radios * this.radios;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radios;
    }

    public boolean contains(double x, double y) {
        return this.calculateDistance(this, x, y) <= this.radios;
    }

    public boolean contains(Circle2D circle) {
        return this.radios >= (this.calculateDistance(this, circle) + circle.radios);
    }

    public boolean overlaps(Circle2D circle) {
        return this.calculateDistance(this, circle) <= (this.radios + circle.radios) && !contains(circle);
    }

    private double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    private double calculateDistance(Circle2D a, double x2, double y2) {
        return Math.sqrt(Math.pow((a.x - x2), 2) + Math.pow((a.y - y2), 2));
    }

    private double calculateDistance(Circle2D a, Circle2D b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }

    public String toString() {
        return "Center: (" + this.getX() + "," + this.getY() + ")\nRadius: " + this.getRadios() + "\nPerimeter: " + this.getPerimeter() + "\nArea: " + this.getArea() ;
    }
}
