package academy.tochkavhoda.figures.v3;

import academy.tochkavhoda.colors.v3.Color;
import academy.tochkavhoda.colors.v3.ColorException;
import academy.tochkavhoda.iface.v3.Colored;

public class ColoredCircle extends Circle implements Colored {
    private Color color;

    public ColoredCircle(Point center, int radius, Color color) {
        super(center, radius);
        this.color = color;
    }

    public ColoredCircle(Point center, int radius, String color) {
        super(center, radius);
        try {
            setColor(color);
        } catch (ColorException e) {
            throw new RuntimeException(e);
        }
    }

    public ColoredCircle(int xCenter, int yCenter, int radius, Color color) {
        super(xCenter, yCenter, radius);
        this.color = color;
    }

    public ColoredCircle(int xCenter, int yCenter, int radius, String color) {
        super(xCenter, yCenter, radius);
        try {
            setColor(color);
        } catch (ColorException e) {
            throw new RuntimeException(e);
        }
    }

    public ColoredCircle(int radius, Color color) {
        super(radius);
        this.color = color;
    }

    public ColoredCircle(int radius, String color) {
        super(radius);
        try {
            setColor(color);
        } catch (ColorException e) {
            throw new RuntimeException(e);
        }
    }

    public ColoredCircle(Color color) {
        super();
        this.color = color;
    }

    public ColoredCircle(String color) {
        super();
        try {
            setColor(color);
        } catch (ColorException e) {
            throw new RuntimeException(e);
        }
    }

    public ColoredCircle() {
        super();
        this.color =Color.RED;
    }

    public Point getCenter() {
        return super.getCenter();
    }

    public int getRadius() {
        return super.getRadius();
    }

    public void setCenter(Point center) {
        super.setCenter(center);
    }

    public void setRadius(int radius) {
        super.setRadius(radius);
    }

    public void moveRel(int dx, int dy) {
        super.moveRel(dx, dy);
    }

    public void resize(double ratio) {
        super.resize(ratio);
    }

    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    public boolean isInside(int x, int y) {
        return super.isInside(x, y);
    }

    public boolean isInside(Point point) {
        return super.isInside(point);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ColoredCircle that = (ColoredCircle) o;

        return color == that.color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }


    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(String colorString) throws ColorException {
        this.color = Color.valueOf(colorString);
    }
}
