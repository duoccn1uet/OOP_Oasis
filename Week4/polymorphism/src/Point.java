public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /** f. */
    public double distance(Point other) {
        double disX = Math.abs(pointX - other.pointX);
        double disY = Math.abs(pointY - other.pointY);
        return Math.sqrt(disX * disX + disY * disY);
    }

    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }

    /** compare. */
    public boolean equals(Object other) {
        if (!(other instanceof Point)) {
            return false;
        }
        Point temp = (Point) other;
        return temp.getPointX() == pointX
            && temp.getPointY() == pointY;
    }
}
