package e_13_5;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    protected String color  = "white";
    protected boolean filled;
    protected java.util.Date dateCreated;
    protected GeometricObject() {
        dateCreated  = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    @Override
    public int compareTo(GeometricObject geo) {
        if (this.getArea() > geo.getArea())
            return 1;
        else if (this.getArea() == geo.getArea())
            return 0;
        else
            return -1;
    }

    public static GeometricObject max (GeometricObject geo1, GeometricObject geo2) {
        return (geo1.compareTo(geo2) > 0) ? geo1 : geo2;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
