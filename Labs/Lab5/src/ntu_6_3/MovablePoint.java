package ntu_6_3;

public class MovablePoint implements Movable {
    // instance variables
    int x, y, xSpeed, ySpeed;     // package access

    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;   // y-axis pointing down for 2D graphics
    }

    @Override
    public void moveDown() {
        y += ySpeed;   // y-axis pointing down for 2D graphics
    }

    @Override
    public void moveLeft() {
        y -= xSpeed;   // y-axis pointing down for 2D graphics
    }

    @Override
    public void moveRight() {
        y += xSpeed;   // y-axis pointing down for 2D graphics
    }

    @Override
    public String toString() {
        return "Point (" + this.x + ", " + this.y + ")" +
                "\n Speed Vertical   :" + this.y +
                "\n Speed Horizontal :" + this.x;
    }
}
