package academy.tochkavhoda.iface.v3;

import academy.tochkavhoda.figures.v3.Point;

public interface Movable {
    default void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }
    void moveTo(int x, int y);
    void moveRel(int dx, int dy);
}
