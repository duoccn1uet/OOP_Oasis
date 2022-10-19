public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        width = length = side;
    }

    /** constructor. */
    public Square(double side, String color, boolean filled) {
        this(side);
        this.color = color;
        this.filled = filled;
    }

    /** constructor. */
    public Square(Point topLeft, double side, String color, boolean filled) {
        this(side, color, filled);
        this.topLeft = topLeft;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = length = side;
    }

    @Override
    public void setWidth(double side) {
        width = length = side;
    }

    @Override
    public void setLength(double side) {
        width = length = side;
    }

    @Override
    public String toString() {
        String res = "Square[";
        res += "topLeft=" + getTopLeft().toString();
        res += ",side=" + width + ",color=" + color + ",filled=" + filled + "]";
        return res;
    }

    /** compare. */
    public boolean equals(Object other) {
        if (!(other instanceof Square)) {
            return false;
        }
        Square temp = (Square) other;
        return topLeft.equals(temp.topLeft)
                && getSide() == temp.getSide();
    }
}
