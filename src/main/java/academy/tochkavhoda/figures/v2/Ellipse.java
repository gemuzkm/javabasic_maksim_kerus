package academy.tochkavhoda.figures.v2;

import academy.tochkavhoda.iface.v2.Stretchable;

public class Ellipse extends Figure implements Stretchable {
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

    @Override
    public void moveTo(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    @Override
    public void moveRel(int dx, int dy) {
        center.moveRel(dx, dy);
    }

    @Override
    public void resize(double ratio) {
        xAxis = (int) (xAxis * ratio);
        yAxis = (int) (yAxis * ratio);
    }

    @Override
    public void stretch(double xRatio, double yRatio) {
        xAxis = (int) (xAxis * xRatio);
        yAxis = (int) (yAxis * yRatio);
    }

    @Override
    public double getArea() {
        return Math.PI * xAxis * yAxis / 4;
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(xAxis, 2) + Math.pow(yAxis, 2))/ 8);
    }

    public boolean isInside(int x, int y) {
        return Math.pow(x - center.getX(), 2) / Math.pow(xAxis / 2, 2) + Math.pow(y - center.getY(), 2) / Math.pow(yAxis / 2, 2) <= 1;
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
