package academy.tochkavhoda.figures.v2;

public class CircleFactory {
    private static int countCircles = 0;
    public static Circle createCircle(Point center, int radius) {
        countCircles++;
        return new Circle(center, radius);
    }

    public static int getCircleCount() {
        return countCircles;
    }

    public static void reset() {
        countCircles = 0;
    }

}
