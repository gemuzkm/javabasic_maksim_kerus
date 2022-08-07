package academy.tochkavhoda.figures.v2;

import academy.tochkavhoda.iface.v2.HasArea;
import academy.tochkavhoda.iface.v2.Resizable;

public abstract class Figure extends Point implements HasArea, Resizable {
    abstract boolean isInside(int x, int y);
    abstract boolean isInside(Point point);
    abstract double getPerimeter();
}
