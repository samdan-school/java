package chap_20.l_e_20_4;

public class Point implements Comparable<Point> {
    public double x;
    public double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if (this.x != p.x) return (int)(this.x - p.x);
        return (int)(this.y - p.y);
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
