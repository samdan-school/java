package HW_4.e_10_12;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        setX(0);
        setY(0);
    }

    public MyPoint(double x, double y) {
        setX(x);
        setY(y);
    }

    public MyPoint(MyPoint a) {
        setX(a.x);
        setY(a.y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow((this.getX() - p.getX()), 2) + Math.pow((this.getY() - p.getY()), 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((this.getX() - x), 2) + Math.pow((this.getY() - y), 2));
    }

    public String toString() {
        return "Point info =>(" + this.getX() + ", " + this.getY() + ")";
    }

    public static void main(String[] args) {
        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint(10, 30.5);
        System.out.println(a.toString() + " " + a.distance(0, 0));
        System.out.println(b.toString() + " " + b.distance(0, 0));
    }
}