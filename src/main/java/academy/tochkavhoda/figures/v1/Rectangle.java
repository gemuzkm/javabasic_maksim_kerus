package academy.tochkavhoda.figures.v1;

public class Rectangle {
    private Point leftTop;
    private Point rightBottom;

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public Rectangle(int xLeft, int yTop, int xRight, int yBottom) {
        this(new Point(xLeft, yTop), new Point(xRight, yBottom));
    }

    public Rectangle(int length, int width) {
        this(0, 0, length, width);
    }

    public Rectangle() {
        this(0, 0, 1, 1);
    }

    public Point getTopLeft() {
        return leftTop;
    }

    public Point getBottomRight() {
        return rightBottom;
    }

    public void setTopLeft(Point topLeft) {
        this.leftTop = topLeft;
    }

    public void setBottomRight(Point bottomRight) {
        this.rightBottom = bottomRight;
    }

    public int getLength() {
        return rightBottom.getX() - leftTop.getX();
    }

    public int getWidth() {
        return rightBottom.getY() - leftTop.getY();
    }

    public void moveTo(int x, int y) {
        leftTop.setX(x);
        leftTop.setY(y);
        rightBottom.setX(x + getLength());
        rightBottom.setY(y + getWidth());
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        leftTop.moveRel(dx, dy);
        rightBottom.moveRel(dx, dy);
    }

    public void resize(double ratio) {
        int length = (int) (getLength() * ratio);
        int width = (int) (getWidth() * ratio);
        leftTop.setX(leftTop.getX() + (getLength() - length) / 2);
        leftTop.setY(leftTop.getY() + (getWidth() - width) / 2);
        rightBottom.setX(leftTop.getX() + length);
        rightBottom.setY(leftTop.getY() + width);
    }

    public void stretch(double xRatio, double yRatio) {
        int length = (int) (getLength() * xRatio);
        int width = (int) (getWidth() * yRatio);
        leftTop.setX(leftTop.getX() + (getLength() - length) / 2);
        leftTop.setY(leftTop.getY() + (getWidth() - width) / 2);
        rightBottom.setX(leftTop.getX() + length);
        rightBottom.setY(leftTop.getY() + width);
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public boolean isInside(int x, int y) {
        return x >= leftTop.getX() && x <= rightBottom.getX() && y >= leftTop.getY() && y <= rightBottom.getY();
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Rectangle rectangle) {
        return !(rectangle.getTopLeft().getX() > rightBottom.getX() || rectangle.getTopLeft().getY() > rightBottom.getY() || rectangle.getBottomRight().getX() < leftTop.getX() || rectangle.getBottomRight().getY() < leftTop.getY());
    }

    public boolean isInside(Rectangle rectangle) {
        return rectangle.getTopLeft().getX() <= leftTop.getX() && rectangle.getTopLeft().getY() <= leftTop.getY() && rectangle.getBottomRight().getX() >= rightBottom.getX() && rectangle.getBottomRight().getY() >= rightBottom.getY();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (!leftTop.equals(rectangle.leftTop)) return false;
        return rightBottom.equals(rectangle.rightBottom);
    }

    @Override
    public int hashCode() {
        int result = leftTop.hashCode();
        result = 31 * result + rightBottom.hashCode();
        return result;
    }
}