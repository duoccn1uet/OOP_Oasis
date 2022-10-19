public class Circle extends Shape {
    private static final double PI = Math.acos(-1);
    protected Point center;
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(Point center, double radius, String color, boolean filled) {
        this(radius, color, filled);
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }


    public double getPerimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        String res = "Circle[";
        res += "center=" + getCenter().toString();
        res += ",radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
        return res;
    }

    /** compare. */
    public boolean equals(Object other) {
        if (!(other instanceof Circle)) {
            return false;
        }
        Circle temp = (Circle) other;
        return radius == temp.radius && center.equals(temp.center);
    }
}
