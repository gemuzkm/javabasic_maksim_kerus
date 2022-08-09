package academy.tochkavhoda.figures.v3;

public class Square extends Figure {
    private int size;
    private Point leftTop;

    public Square(Point leftTop, int size) {
        this.leftTop = leftTop;
        this.size = size;
    }

    public Square(int xLeft, int yTop, int size) {
        this(new Point(xLeft, yTop), size);
    }

    public Square(int size) {
        this(0, -size, size);
    }

    public Square() {
        this(0, -1, 1);
    }

    public Point getTopLeft() {
        return leftTop;
    }

    public Point getBottomRight() {
        return new Point(leftTop.getX() + size, leftTop.getY() + size);
    }

    public void setTopLeft(Point topLeft) {
        this.leftTop = topLeft;
    }

    public int getLength() {
        return size;
    }

    @Override
    public void moveTo(int x, int y) {
        leftTop.setX(x);
        leftTop.setY(y);
    }

    @Override
    public void moveRel(int dx, int dy) {
        leftTop.moveRel(dx, dy);
    }

    @Override
    public void resize(double ratio) {
        size = (int) (size * ratio);
    }

    public double getArea() {
        return size * size;
    }

    public double getPerimeter() {
        return 4 * size;
    }

    public boolean isInside(int x, int y) {
        return x >= leftTop.getX() && x <= leftTop.getX() + size && y >= leftTop.getY() && y <= leftTop.getY() + size;
    }

    public boolean isIntersects(Square square) {
        return !(square.getTopLeft().getX() > getBottomRight().getX() || square.getTopLeft().getY() > getBottomRight().getY() || square.getBottomRight().getX() < getTopLeft().getX() || square.getBottomRight().getY() < getTopLeft().getY());
    }

    public boolean isInside(Square square) {
        return square.getTopLeft().getX() >= leftTop.getX() && square.getTopLeft().getY() >= leftTop.getY() && square.getBottomRight().getX() <= leftTop.getX() + size && square.getBottomRight().getY() <= leftTop.getY() + size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (size != square.size) return false;
        return leftTop.equals(square.leftTop);
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + leftTop.hashCode();
        return result;
    }
}
