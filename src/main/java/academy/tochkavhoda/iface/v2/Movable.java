package academy.tochkavhoda.iface.v2;

import academy.tochkavhoda.figures.v2.Point;

public interface Movable {
    default void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }
    void moveTo(int x, int y);
    void moveRel(int dx, int dy);
}
