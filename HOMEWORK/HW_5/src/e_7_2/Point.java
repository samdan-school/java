package e_7_2;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.setXY(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] xy = {getX(), getY()};
        return xy;
    }

    public void setXY(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow((this.getX() - another.getX()), 2) + Math.pow((this.getY() - another.getY()), 2));
    }
}
