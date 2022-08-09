package academy.tochkavhoda.figures.v3;

import academy.tochkavhoda.iface.v3.HasArea;
import academy.tochkavhoda.iface.v3.Movable;
import academy.tochkavhoda.iface.v3.Resizable;

public abstract class Figure implements HasArea, Resizable, Movable {
    public abstract boolean isInside(int x, int y);
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public abstract double getPerimeter();
}
