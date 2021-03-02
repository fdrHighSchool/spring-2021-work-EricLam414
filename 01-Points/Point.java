public class Point {
    private double x;
    private double y;

    public Point() {
      this(0, 0);
    }

    public Point(double x, double y) {
      setLocation(x, y);
    }

    public double distanceFromOrigin() {
      return Math.sqrt(x * x + y * y);
    }

    public double getX() {
      return x;
    }

    public double getY() {
      return y;
    }

    public void setLocation(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public String toString() {
      return "(" + x + ", " + y + ")";
    }

    public void translate(double dx, double dy) {
      setLocation(x + dx, y + dy);
    }

    public double distance(Point point) {
      return Math.sqrt(((this.x - point.getX()) * (this.x - point.getX())) + ((this.y - point.getY()) * (this.y - point.getY())));
    }

    public Point midpoint(Point point) {
      return new Point((this.x + point.getX()) / 2, (this.y + point.getY()) / 2);
    }

    public double slope(Point point) {
      return (point.getY() - this.y) / (point.getX() - this.x);
    }

    public boolean isCollinear(Point point1, Point point2) {
      return this.slope(point1) == this.slope(point2);
    }
}
