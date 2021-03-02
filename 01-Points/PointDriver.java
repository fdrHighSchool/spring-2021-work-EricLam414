import java.util.ArrayList;

public class PointDriver {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();

        points.add(new Point());
        System.out.println(points.get(0).toString());
        points.add(new Point(3, 4));
        points.add(new Point(6, 8));

        System.out.println(points.get(0).slope(points.get(1)));
        System.out.println(points.get(0).midpoint(points.get(1)));
        System.out.println(points.get(0).distance(points.get(1)));

        System.out.println(points.get(0).isCollinear(points.get(1), points.get(2)));

    }
}
