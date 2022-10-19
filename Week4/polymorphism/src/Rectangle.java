public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** constructor. */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /** constructor. */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        this(width, length, color, filled);
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        String res = "Rectangle[";
        res += "topLeft=" + getTopLeft().toString();
        res += ",width=" + width;
        res += ",length=" + length;
        res += ",color=" + color;
        res += ",filled=" + filled;
        res += "]";
        return res;
    }

    /** compare. */
    public boolean equals(Object other) {
        if (!(other instanceof Rectangle)) {
            return false;
        }
        Rectangle temp = (Rectangle) other;
        return topLeft.equals(temp.topLeft)
            && width == temp.getWidth()
            && length == temp.getLength();
    }
}
