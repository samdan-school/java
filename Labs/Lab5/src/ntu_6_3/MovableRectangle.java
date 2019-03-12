package ntu_6_3;

public class MovableRectangle implements Movable{

    

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }

    @Override
    public String toString() {
        return "Circle radius" + this.radius +
                "\nCenter Point (" + this.center.x + ", " + this.center.y + ")" +
                "\n Speed Vertical   :" + this.center.y +
                "\n Speed Horizontal :" + this.center.x;
    }
}
