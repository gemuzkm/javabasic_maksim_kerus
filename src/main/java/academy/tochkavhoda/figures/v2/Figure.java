package academy.tochkavhoda.figures.v2;

import academy.tochkavhoda.iface.v2.HasArea;
import academy.tochkavhoda.iface.v2.Movable;
import academy.tochkavhoda.iface.v2.Resizable;

public abstract class Figure implements HasArea, Resizable, Movable {
    abstract boolean isInside(int x, int y);

    boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    abstract double getPerimeter();
}
