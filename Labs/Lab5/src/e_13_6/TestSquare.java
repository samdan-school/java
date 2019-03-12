package e_13_6;

public class TestSquare {
    GeometricObject[] geos = new GeometricObject[5];

    TestSquare () {
        geos[0] = new Triangle();
        geos[1] = new Square();
        geos[2] = new Triangle();
        geos[3] = new Square();
        geos[4] = new Triangle();

        for (GeometricObject geo : geos) {
            if (geo instanceof Colorable)
                ((Colorable) geo).howToColor();
            System.out.println(geo.getArea() + "\n");

        }
    }


    public static void main(String[] args) {
        new TestSquare();
    }
}
