package academy.tochkavhoda.figures.v1;

public class Ellipse {
    private Point center;
    private int xAxis;
    private int yAxis;

    public Ellipse(Point center, int xAxis, int yAxis) {
        this.center = center;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this(new Point(xCenter, yCenter), xAxis, yAxis);
    }

    public Ellipse(int xAxis, int yAxis) {
        this(0, 0, xAxis, yAxis);
    }

    public Ellipse() {
        this(0, 0, 1, 1);
    }

    public Point getCenter() {
        return center;
    }

    public int getXAxis() {
        return xAxis;
    }

    public int getYAxis() {
        return yAxis;
    }

    public void setXAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void moveTo(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        center.moveRel(dx, dy);
    }

    public void resize(double ratio) {
        xAxis = (int) (xAxis * ratio);
        yAxis = (int) (yAxis * ratio);
    }

    public void stretch(double xRatio, double yRatio) {
        xAxis = (int) (xAxis * xRatio);
        yAxis = (int) (yAxis * yRatio);
    }

    public double getArea() {
        return Math.PI * xAxis * yAxis;
    }

    public double getPerimeter() {
        return Math.PI * (3 * (xAxis + yAxis) - Math.sqrt((3 * xAxis + yAxis) * (xAxis + 3 * yAxis)));
    }

    public boolean isInside(int x, int y) {
        return center.getX() - xAxis <= x && x <= center.getX() + xAxis && center.getY() - yAxis <= y && y <= center.getY() + yAxis;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ellipse ellipse = (Ellipse) o;

        if (xAxis != ellipse.xAxis) return false;
        if (yAxis != ellipse.yAxis) return false;
        return center.equals(ellipse.center);
    }

    @Override
    public int hashCode() {
        int result = center.hashCode();
        result = 31 * result + xAxis;
        result = 31 * result + yAxis;
        return result;
    }
}
