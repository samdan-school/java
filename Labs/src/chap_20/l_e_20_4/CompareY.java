package chap_20.l_e_20_4;

import java.util.Comparator;

public class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point point, Point t1) {
        if (point.y != t1.y) return (int)(point.y - t1.y);
        return (int)(point.x - t1.x);
    }
}
